package com.enesakdn.n11finaluserService.controller;

import com.enesakdn.n11finaluserService.client.RestaurantClient;
import com.enesakdn.n11finaluserService.dto.RestaurantDTO;
import com.enesakdn.n11finaluserService.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/restaurants")
public class RestaurantController {

    private final RestaurantClient restaurantClient;
    private final RestaurantService restaurantService;

    @Autowired
    public RestaurantController(RestaurantClient restaurantClient, RestaurantService restaurantService) {
        this.restaurantClient = restaurantClient;

        this.restaurantService = restaurantService;
    }

    @GetMapping
    public ResponseEntity<List<RestaurantDTO>> getAllRestaurants() {
        ResponseEntity<List<RestaurantDTO>> response = restaurantClient.getAllRestaurants();
        return ResponseEntity.status(response.getStatusCode()).body(response.getBody());
    }

    @GetMapping("/{id}")
    public ResponseEntity<RestaurantDTO> getRestaurantById(@PathVariable("id") String id) {
        ResponseEntity<RestaurantDTO> response = restaurantClient.getRestaurantById(id);
        return ResponseEntity.status(response.getStatusCode()).body(response.getBody());
    }
    @GetMapping("/recommended-restaurants/{userId}")
    public List<RestaurantDTO> getRecommendedRestaurants(@PathVariable long userId) {
        return restaurantService.selectRecommendations(userId);
    }
}