package praktikum;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class IngredientTest {
    Ingredient ingredient;
    private String name = "Тестовое имя ингредиента";
    private float price = 123.321f;
    IngredientType test;

    @Before
    public void setUp() {
        ingredient = new Ingredient(test, name, price);
    }

    @Test
    public void getPrice() {
        assertEquals("Не верная цена ингредиента", price, ingredient.getPrice(), 0);
    }

    @Test
    public void getName() {
        assertEquals("Не верное имя ингредиента", name, ingredient.getName());
    }

    @Test
    public void getType() {
        assertEquals("Не верное название типа ингредиента", test, ingredient.getType());
    }
}