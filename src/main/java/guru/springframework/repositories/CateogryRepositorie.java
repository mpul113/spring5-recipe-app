package guru.springframework.repositories;

import guru.springframework.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CateogryRepositorie extends CrudRepository<Category, Long> {
}
