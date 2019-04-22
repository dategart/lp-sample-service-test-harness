package com.autodesk.lp.sample.repository;

import java.util.List;

import com.autodesk.lp.sample.domain.Food;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Rest resource available at host:port/food
 *
 * @author David.Tegart
 */
@RepositoryRestResource(collectionResourceRel = "food", path = "food")
public interface FoodRepository extends PagingAndSortingRepository<Food, Long> {

    List<Food> findByName(@Param("name") String name);
}