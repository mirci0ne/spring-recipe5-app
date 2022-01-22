package guru.springframework.springrecipe5app.repositories;

import guru.springframework.springrecipe5app.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
