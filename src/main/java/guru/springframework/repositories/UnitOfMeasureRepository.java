package guru.springframework.repositories;

import guru.springframework.model.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

//Needs to be exactly how it was written in DB/Pojo value for the method name
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
    Optional<UnitOfMeasure> findByUnitOfMeasure(String unitOfMeasure);
}
