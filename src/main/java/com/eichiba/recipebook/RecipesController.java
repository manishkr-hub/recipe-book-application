package com.eichiba.recipebook;

import com.eichiba.recipebook.models.Recipes;
import com.eichiba.recipebook.repositories.RecipesRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/recipes")
public class RecipesController {
    @Autowired
    private RecipesRepository repository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Recipes> getAllRecipes() {
        return repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Recipes getRecipeById(@PathVariable("id") ObjectId id) {
        return repository.findBy_id(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void modifyRecipeById(@PathVariable("id") ObjectId id, @Valid @RequestBody Recipes recipes) {
        recipes.setId(id);
        repository.save(recipes);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Recipes createRecipe(@Valid @RequestBody Recipes recipes) {
        recipes.setId(ObjectId.get());
        repository.save(recipes);
        return recipes;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteRecipe(@PathVariable ObjectId id) {
        repository.delete(repository.findBy_id(id));
    }
}