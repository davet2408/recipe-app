package com.example.simplerecipeapp.services;

import com.example.simplerecipeapp.model.Recipe;

import java.util.Set;

public interface RecipeService {

    public Set<Recipe> getRecipes();
}
