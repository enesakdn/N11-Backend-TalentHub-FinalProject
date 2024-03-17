package com.enesakdn.n11finalrestaurantService.dao;

import com.enesakdn.n11finalrestaurantService.entity.Restaurant;
import org.springframework.data.solr.repository.SolrCrudRepository;

public interface RestaurantRepository extends SolrCrudRepository<Restaurant,String> {
}
