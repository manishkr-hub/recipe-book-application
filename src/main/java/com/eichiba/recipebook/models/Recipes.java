package com.eichiba.recipebook.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.util.List;

public class Recipes {

    @Id
    private ObjectId id;

    private String name;
    private List<Ingredient> ingredients;
    private String direction;
    private int prepTime;
    private int numberOfRatings;

    public Recipes() {}

    public Recipes(ObjectId id, String name, List<Ingredient> ingredients, String direction, int prepTime, int numberOfRatings) {
        this.id = id;
        this.name = name;
        this.ingredients = ingredients;
        this.direction = direction;
        this.prepTime = prepTime;
        this.numberOfRatings = numberOfRatings;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int getPrepTime() {
        return prepTime;
    }

    public void setPrepTime(int prepTime) {
        this.prepTime = prepTime;
    }

    public int getNumberOfRatings() {
        return numberOfRatings;
    }

    public void setNumberOfRatings(int numberOfRatings) {
        this.numberOfRatings = numberOfRatings;
    }

}
