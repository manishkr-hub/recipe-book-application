package com.eichiba.recipebook.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Ingredient {

    private String name;
    private double quantity;
    private String description;

    public Ingredient() {}

    public Ingredient(String name, double quantity, String description) {
        this.name = name;
        this.quantity = quantity;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
