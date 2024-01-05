package com.eichiba.recipebook.repositories;

import com.eichiba.recipebook.models.Recipes;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RecipesRepository extends MongoRepository<Recipes, String> {
    Optional<Recipes> findById(String id);
}
