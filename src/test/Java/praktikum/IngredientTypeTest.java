package praktikum;

import org.junit.Test;

import static org.junit.Assert.*;

public class IngredientTypeTest {

    @Test
    public void testIngredientTypeValues() {
        // Проверяем, что перечисление содержит ожидаемые значения
        IngredientType[] values = IngredientType.values();
        assertEquals(2, values.length);
        assertEquals(IngredientType.SAUCE, values[0]);
        assertEquals(IngredientType.FILLING, values[1]);
    }

    @Test
    public void testIngredientTypeValueOf() {
        // Проверяем, что метод valueOf корректно возвращает значения перечисления
        assertEquals(IngredientType.SAUCE, IngredientType.valueOf("SAUCE"));
        assertEquals(IngredientType.FILLING, IngredientType.valueOf("FILLING"));
    }

    @Test
    public void testIngredientTypeOrdinal() {
        // Проверяем порядок значений в перечислении
        assertEquals(0, IngredientType.SAUCE.ordinal());
        assertEquals(1, IngredientType.FILLING.ordinal());
    }
}