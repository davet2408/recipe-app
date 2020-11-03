package com.example.simplerecipeapp.services;

import com.example.simplerecipeapp.commands.RecipeCommand;
import com.example.simplerecipeapp.model.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long id);

    RecipeCommand saveRecipeCommand(RecipeCommand command);
}
