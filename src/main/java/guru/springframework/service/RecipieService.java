package guru.springframework.service;


import guru.springframework.model.Recipe;

import java.util.Optional;
import java.util.Set;

public interface RecipieService {
    Set<Recipe> getRecipie();
}
