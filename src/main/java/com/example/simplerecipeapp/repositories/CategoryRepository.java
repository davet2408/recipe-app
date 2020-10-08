package com.example.simplerecipeapp.repositories;

import com.example.simplerecipeapp.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
