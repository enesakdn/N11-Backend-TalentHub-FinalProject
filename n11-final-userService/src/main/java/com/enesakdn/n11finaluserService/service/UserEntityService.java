package com.enesakdn.n11finaluserService.service;

import com.enesakdn.n11finaluserService.dao.UserRepository;
import com.enesakdn.n11finaluserService.entity.User;
import com.enesakdn.n11finaluserService.general.BaseEntityService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class UserEntityService extends BaseEntityService<User,UserRepository> {
    protected UserEntityService(UserRepository repository) {
        super(repository);
    }

    /*
    * import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Restaurant {
    private String name;
    private double latitude;
    private double longitude;
    private double rating;

    public Restaurant(String name, double latitude, double longitude, double rating) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getRating() {
        return rating;
    }
}

class User {
    private double latitude;
    private double longitude;

    public User(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}

public class RestaurantRecommendationAPI {
    private List<Restaurant> restaurants;

    public RestaurantRecommendationAPI(List<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }

    public List<Restaurant> recommendRestaurants(User user) {
        List<Restaurant> recommendedRestaurants = new ArrayList<>();
        for (Restaurant restaurant : restaurants) {
            double distance = calculateDistance(user.getLatitude(), user.getLongitude(),
            *  restaurant.getLatitude(), restaurant.getLongitude());
            if (distance <= 10.0) {
                double proximityScore = 10.0 - distance; // Distance weighted score
                double totalScore = restaurant.getRating() * 0.7 + proximityScore * 0.3; // Rating and proximity weighted score
                restaurant.setTotalScore(totalScore);
                recommendedRestaurants.add(restaurant);
            }
        }
        recommendedRestaurants.sort(Comparator.comparingDouble(Restaurant::getTotalScore).reversed()); // Sort by total score in descending order
        return recommendedRestaurants.subList(0, Math.min(3, recommendedRestaurants.size())); // Get top 3 restaurants
    }

    private double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
        // Haversine formula to calculate distance between two coordinates
        double dLat = Math.toRadians(lat2 - lat1);
        double dLon = Math.toRadians(lon2 - lon1);
        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
                   Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) *
                   Math.sin(dLon / 2) * Math.sin(dLon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        return 6371 * c; // Radius of Earth in kilometers
    }

    public static void main(String[] args) {
        // Sample usage
        List<Restaurant> restaurants = new ArrayList<>();
        restaurants.add(new Restaurant("Restaurant 1", 40.7128, -74.0060, 4.5));
        restaurants.add(new Restaurant("Restaurant 2", 34.0522, -118.2437, 4.8));
        restaurants.add(new Restaurant("Restaurant 3", 51.5074, -0.1278, 4.3));

        RestaurantRecommendationAPI recommendationAPI = new RestaurantRecommendationAPI(restaurants);
        User user = new User(40.7128, -74.0060);
        List<Restaurant> recommendedRestaurants = recommendationAPI.recommendRestaurants(user);

        System.out.println("Recommended Restaurants:");
        for (Restaurant restaurant : recommendedRestaurants) {
            System.out.println(restaurant.getName());
        }
    }
}

    * */
}
