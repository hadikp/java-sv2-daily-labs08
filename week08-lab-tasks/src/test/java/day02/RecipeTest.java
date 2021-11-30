package day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecipeTest {

    @Test
    void testAddIngredients() {
        Recipe recipe = new Recipe("Almáspite");
        recipe.addIngredient("alma");
        System.out.println(recipe.getRecipeList());

        recipe.addIngredient("körte", "cukor", "liszt");
        System.out.println(recipe.getRecipeList());
    }

}