package com.enesakdn.n11finalrestaurantService.convert;

import com.enesakdn.n11finalrestaurantService.dto.RestaurantDTO;
import com.enesakdn.n11finalrestaurantService.entity.Restaurant;
import com.enesakdn.n11finalrestaurantService.request.SaveRequestRestaurant;
import com.enesakdn.n11finalrestaurantService.request.UpdateRequestRestaurant;

public class RestaurantConverter {

    public static RestaurantDTO toRestaurantDTO(Restaurant restaurant) {
        return new RestaurantDTO(
                restaurant.getId(),
                restaurant.getName(),
                restaurant.getAddress(),
                restaurant.getCity(),
                restaurant.getCountry(),
                restaurant.getPhoneNumber(),
                restaurant.getLatitude(),
                restaurant.getLongitude()
        );
    }

    public static Restaurant toRestaurantSaveEntity(SaveRequestRestaurant saveRequestRestaurant) {
        Restaurant restaurant = new Restaurant();
        restaurant.setId(saveRequestRestaurant.id());
        restaurant.setName(saveRequestRestaurant.name());
        restaurant.setAddress(saveRequestRestaurant.address());
        restaurant.setCity(saveRequestRestaurant.city());
        restaurant.setCountry(saveRequestRestaurant.country());
        restaurant.setPhoneNumber(saveRequestRestaurant.phoneNumber());
        restaurant.setLatitude(saveRequestRestaurant.latitude());
        restaurant.setLongitude(saveRequestRestaurant.longitude());
        return restaurant;
    }

    public static Restaurant toRestaurantUpdateEntity(UpdateRequestRestaurant updateRequestRestaurant) {
        Restaurant restaurant = new Restaurant();
        restaurant.setId(updateRequestRestaurant.id());
        restaurant.setName(updateRequestRestaurant.name());
        restaurant.setAddress(updateRequestRestaurant.address());
        restaurant.setCity(updateRequestRestaurant.city());
        restaurant.setCountry(updateRequestRestaurant.country());
        restaurant.setPhoneNumber(updateRequestRestaurant.phoneNumber());
        restaurant.setLatitude(updateRequestRestaurant.latitude());
        restaurant.setLongitude(updateRequestRestaurant.longitude());
        return restaurant;
    }

}
