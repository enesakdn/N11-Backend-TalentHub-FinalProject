package com.enesakdn.n11finalrestaurantService.request;

public record UpdateRequestRestaurant(
        String id,
        String name,
        String address,
        String city,
        String country,
        String phoneNumber,
        double latitude,
        double longitude
) {
}
