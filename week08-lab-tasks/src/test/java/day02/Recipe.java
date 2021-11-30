package day02;

import java.util.ArrayList;
import java.util.List;

public class Recipe {

    private String name;
    private List<String> recipeList = new ArrayList<>();
    private String description;

    public Recipe(String name) {
        this.name = name;
    }

    public Recipe(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void addIngredient(String ingredient, String... ingredients) {
        recipeList.add(ingredient);
        for (String st: ingredients) {
            recipeList.add(st);
        }
    }

    public String getName() {
        return name;
    }

    public List<String> getRecipeList() {
        return recipeList;
    }

    public String getDescription() {
        return description;
    }
}
