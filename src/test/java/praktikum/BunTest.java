package praktikum;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BunTest {
    private Bun bun;
    private final String name = "Тестовое имя хлеба";
    private final float price = 3.141592f;

    @Before
    public void setUp() {
        bun = new Bun(name, price);
    }

    @Test
    public void getName() {
        assertEquals("Не верное название хлеба", name, bun.getName());
    }

    @Test
    public void getPrice() {
        assertEquals("Не верная цена", price, bun.getPrice(), 0);
    }
}