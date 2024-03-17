package com.enesakdn.n11finaluserService.service;

import com.enesakdn.n11finaluserService.dao.UserRepository;
import com.enesakdn.n11finaluserService.dto.RestaurantDTO;
import com.enesakdn.n11finaluserService.entity.User;
import com.enesakdn.n11finaluserService.general.BaseEntityService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserEntityService extends BaseEntityService<User,UserRepository> {
    protected UserEntityService(UserRepository repository) {
        super(repository);
    }

    private double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
        final int R = 6371; // Yeryüzünün ortalama yarıçapı (km)
        double dLat = Math.toRadians(lat2 - lat1);
        double dLon = Math.toRadians(lon2 - lon1);
        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
                Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) *
                        Math.sin(dLon / 2) * Math.sin(dLon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        return R * c; // Mesafe km cinsinden döndürülür

    }
}
