package com.enesakdn.n11finalrestaurantService.service;

import com.enesakdn.n11finalrestaurantService.convert.RestaurantConverter;
import com.enesakdn.n11finalrestaurantService.dao.RestaurantRepository;
import com.enesakdn.n11finalrestaurantService.dto.RestaurantDTO;
import com.enesakdn.n11finalrestaurantService.entity.Restaurant;
import com.enesakdn.n11finalrestaurantService.request.SaveRequestRestaurant;
import com.enesakdn.n11finalrestaurantService.request.UpdateRequestRestaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class RestaurantServiceImpl implements RestaurantService {

    private final RestaurantRepository restaurantRepository;

    @Autowired
    public RestaurantServiceImpl(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    @Override
    public RestaurantDTO addRestaurant(SaveRequestRestaurant saveRequestRestaurant) {
        Restaurant restaurant = RestaurantConverter.toRestaurantSaveEntity(saveRequestRestaurant);
        System.out.println(restaurant.getName() + restaurant.getCountry());
        Restaurant savedRestaurant = restaurantRepository.save(restaurant);
        return RestaurantConverter.toRestaurantDTO(savedRestaurant);
    }

    @Override
    public RestaurantDTO updateRestaurant(UpdateRequestRestaurant updateRequestRestaurant) {
        Restaurant existingRestaurant = restaurantRepository.findById(updateRequestRestaurant.id())
                .orElseThrow(() -> new RuntimeException("Restaurant not found with id: " + updateRequestRestaurant.id()));

        Restaurant updatedRestaurant = RestaurantConverter.toRestaurantUpdateEntity(updateRequestRestaurant);
        updatedRestaurant.setId(existingRestaurant.getId()); // Keep the same ID
        Restaurant savedRestaurant = restaurantRepository.save(updatedRestaurant);
        return RestaurantConverter.toRestaurantDTO(savedRestaurant);
    }

    @Override
    public void deleteRestaurant(String id) {
        restaurantRepository.deleteById(id);
    }

    @Override
    public List<RestaurantDTO> getAllRestaurants() {
        Iterable<Restaurant> restaurants = restaurantRepository.findAll();
        List<RestaurantDTO> restaurantDTOs = new ArrayList<>();
        for (Restaurant restaurant : restaurants) {
            restaurantDTOs.add(RestaurantConverter.toRestaurantDTO(restaurant));
        }
        return restaurantDTOs;
    }
    @Override
    public RestaurantDTO getRestaurantById(String id) {
        Optional<Restaurant> optionalRestaurant = restaurantRepository.findById(id);
        if (optionalRestaurant.isPresent()) {
            return RestaurantConverter.toRestaurantDTO(optionalRestaurant.get());
        } else {
            throw new RuntimeException("Restaurant not found with id: " + id);
        }
    }
}