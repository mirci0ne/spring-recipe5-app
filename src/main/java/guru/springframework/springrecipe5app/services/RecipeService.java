package guru.springframework.springrecipe5app.services;

import guru.springframework.springrecipe5app.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
