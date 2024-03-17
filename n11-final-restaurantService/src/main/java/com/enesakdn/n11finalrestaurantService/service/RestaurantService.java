package com.enesakdn.n11finalrestaurantService.service;

import com.enesakdn.n11finalrestaurantService.dto.RestaurantDTO;
import com.enesakdn.n11finalrestaurantService.request.SaveRequestRestaurant;
import com.enesakdn.n11finalrestaurantService.request.UpdateRequestRestaurant;

import java.util.List;

public interface RestaurantService {

    RestaurantDTO addRestaurant(SaveRequestRestaurant saveRequestRestaurant);

    RestaurantDTO updateRestaurant(UpdateRequestRestaurant updateRequestRestaurant);

    void deleteRestaurant(String id);

    List<RestaurantDTO> getAllRestaurants();

    RestaurantDTO getRestaurantById(String id);
}
