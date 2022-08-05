package guru.springframework.repositories;

import guru.springframework.model.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipieRepository extends CrudRepository<Recipe, Long> {
}
