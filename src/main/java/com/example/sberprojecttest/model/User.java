package com.example.sberprojecttest.model;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
public class User {

    private String name = null;
    private String lastName = null;
    private int age = 0;
    private int phoneNumber = 0;


    public List<User> addNewUser(User user) {
        List<User> users = new ArrayList<>();
        users.add(user);
        return users;
    }

    public User changeName(String name) {
        this.name = name;
        return this;
    }
}
