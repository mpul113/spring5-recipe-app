package guru.springframework.service;

import guru.springframework.model.Recipe;
import guru.springframework.repositories.RecipieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class RecipieServiceImpl implements RecipieService {

    private final RecipieRepository recipieRepository;

    @Autowired
    public RecipieServiceImpl(RecipieRepository recipieRepository) {
        this.recipieRepository = recipieRepository;
    }

    @Override
    public Set<Recipe> getRecipie() {
        Set<Recipe> recipies = new HashSet<>();
        recipieRepository.findAll().iterator().forEachRemaining(recipies::add);
        return recipies;
    }
}
