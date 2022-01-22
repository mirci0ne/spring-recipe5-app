package guru.springframework.springrecipe5app.repositories;

import guru.springframework.springrecipe5app.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
