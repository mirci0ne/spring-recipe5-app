package guru.springframework.springrecipe5app.services;

import guru.springframework.springrecipe5app.commands.RecipeCommand;
import guru.springframework.springrecipe5app.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand findCommandById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    void deleteById(Long idToDelete);
}
