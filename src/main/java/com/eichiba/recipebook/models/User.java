package com.eichiba.recipebook.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class User {

    @Id
    private ObjectId id;

    private String firstName;
    private String lastName;
    private String mobile;
    private String email;
    private boolean isSuperUser;

    public User() {}

    public User(ObjectId id, String firstName, String lastName, String mobile, String email, boolean isSuperUser) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobile = mobile;
        this.email = email;
        this.isSuperUser = isSuperUser;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isSuperUser() {
        return isSuperUser;
    }

    public void setSuperUser(boolean superUser) {
        isSuperUser = superUser;
    }
}
