package com.eichiba.recipebook.repositories;

import com.eichiba.recipebook.models.Recipes;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RecipesRepository extends MongoRepository<Recipes, String> {
    Recipes findBy_id(ObjectId _id);
}
