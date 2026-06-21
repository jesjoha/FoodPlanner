package me.jesjoha.foodplannerserver.user;

import java.util.UUID;

public class User {
    private int id;
    private String email;
    private String name;

    private static int userCount = 0;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        this.id = userCount++;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }
}
