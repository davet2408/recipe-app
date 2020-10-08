package com.example.simplerecipeapp.repositories;

import com.example.simplerecipeapp.model.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
