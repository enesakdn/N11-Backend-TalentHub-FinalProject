package com.enesakdn.n11finalrestaurantService.dto;

public record RestaurantDTO(
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
