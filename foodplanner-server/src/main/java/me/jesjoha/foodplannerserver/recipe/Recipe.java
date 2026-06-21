package me.jesjoha.foodplannerserver.recipe;

public class Recipe {
    private int id;
    private String name;
    private String description;

    public Recipe(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
