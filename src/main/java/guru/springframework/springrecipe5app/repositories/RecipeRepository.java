package guru.springframework.springrecipe5app.repositories;

import guru.springframework.springrecipe5app.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
