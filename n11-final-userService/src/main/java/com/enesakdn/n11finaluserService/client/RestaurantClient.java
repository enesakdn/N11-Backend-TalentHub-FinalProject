package com.enesakdn.n11finaluserService.client;

import com.enesakdn.n11finaluserService.dto.RestaurantDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(value = "restaurant", url = "http://localhost:8086/api/v1/restaurant")
public interface RestaurantClient {

    @GetMapping("/all")
    ResponseEntity<List<RestaurantDTO>> getAllRestaurants();

    @GetMapping("/{id}")
    ResponseEntity<RestaurantDTO> getRestaurantById(@PathVariable("id") String id);

}
