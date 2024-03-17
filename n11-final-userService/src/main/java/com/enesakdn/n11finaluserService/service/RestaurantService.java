package com.enesakdn.n11finaluserService.service;

import com.enesakdn.n11finaluserService.client.RestaurantClient;
import com.enesakdn.n11finaluserService.dto.RestaurantDTO;
import com.enesakdn.n11finaluserService.entity.User;
import com.enesakdn.n11finaluserService.util.CalculateDistance;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RestaurantService {
    private final RestaurantClient client;
    private final UserEntityService userEntityService;
    private final CommentEntityService commentEntityService;

    public RestaurantService(RestaurantClient client, UserEntityService userEntityService, CommentEntityService commentEntityService) {
        this.client = client;
        this.userEntityService = userEntityService;
        this.commentEntityService = commentEntityService;
    }

    public List<RestaurantDTO> selectRecommendations(long userId) {
        User user = userEntityService.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));

        double userLatitude = user.getLatitude();
        double userLongitude = user.getLongitude();

        // Restaurant puanlarını ve mesafelerini hesaplayıp en iyi 3 restoranı bulma
        List<RestaurantDTO> allRestaurants = (List<RestaurantDTO>) client.getAllRestaurants();
        List<RestaurantDTO> recommendedRestaurants = allRestaurants.stream()
                .filter(r -> {
                    double distance = CalculateDistance.calculateDistance(userLatitude, userLongitude, r.getLatitude(), r.getLongitude());
                    return distance <= 10.0; // 10 km'den daha yakın restoranları filtrele
                })
                .sorted(Comparator.comparingDouble(r -> -commentEntityService.calculateAverageScoreByRestaurantId(r.getId())))
                .limit(3)
                .collect(Collectors.toList());

        return recommendedRestaurants;
    }
}
