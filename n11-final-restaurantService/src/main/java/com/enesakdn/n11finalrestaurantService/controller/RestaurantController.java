package com.enesakdn.n11finalrestaurantService.controller;

import com.enesakdn.n11finalrestaurantService.dto.RestaurantDTO;
import com.enesakdn.n11finalrestaurantService.request.SaveRequestRestaurant;
import com.enesakdn.n11finalrestaurantService.request.UpdateRequestRestaurant;
import com.enesakdn.n11finalrestaurantService.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/restaurant")
public class RestaurantController {

    private final RestaurantService restaurantService;

    @Autowired
    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @PostMapping("/add")
    public ResponseEntity<RestaurantDTO> addRestaurant(@RequestBody SaveRequestRestaurant saveRequestRestaurant) {
        RestaurantDTO addedRestaurant = restaurantService.addRestaurant(saveRequestRestaurant);
        return new ResponseEntity<>(addedRestaurant, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<RestaurantDTO> getRestaurantById(@PathVariable String id) {
        RestaurantDTO restaurant = restaurantService.getRestaurantById(id);
        return new ResponseEntity<>(restaurant, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<RestaurantDTO> updateRestaurant(@RequestBody UpdateRequestRestaurant updateRequestRestaurant) {
        RestaurantDTO updatedRestaurant = restaurantService.updateRestaurant(updateRequestRestaurant);
        return new ResponseEntity<>(updatedRestaurant, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteRestaurant(@PathVariable String id) {
        restaurantService.deleteRestaurant(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/all")
    public ResponseEntity<List<RestaurantDTO>> getAllRestaurants() {
        List<RestaurantDTO> restaurants = restaurantService.getAllRestaurants();
        return new ResponseEntity<>(restaurants, HttpStatus.OK);
    }
}
