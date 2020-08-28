package com.target.training.dao;

import com.target.training.entity.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository // qualifies for component-scan, and instructs JPA-Data to create an object of this type
public interface CategoryRepository extends CrudRepository<Category, Integer> {
}
