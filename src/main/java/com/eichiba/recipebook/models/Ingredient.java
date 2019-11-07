package com.eichiba.recipebook.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Ingredient {

    @Id
    private ObjectId id;

    private String name;
    private double quantity;
    private String description;

    public Ingredient() {}

    public Ingredient(ObjectId id, String name, double quantity, String description) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.description = description;
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
