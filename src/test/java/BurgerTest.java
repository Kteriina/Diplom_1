import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;
import praktikum.IngredientType;

import java.util.ArrayList;
import java.util.List;
@RunWith(MockitoJUnitRunner.class)
public class BurgerTest {

    @Mock
    Bun bun;
    @Mock
    Ingredient ingredient;
    @Mock
    Ingredient ingredient_1;

    @Test
    public void testGetBurgerPrice(){
        Burger burger = new Burger();
        Mockito.when(bun.getPrice()).thenReturn(5.5F);
        burger.setBuns(bun);
        Mockito.when(ingredient.getPrice()).thenReturn(5.5F);
        burger.addIngredient(ingredient);
        Assert.assertEquals(16.5, burger.getPrice(), 0);

    }
    @Test
    public void testAddIngredient(){
        Burger burger = new Burger();
        burger.addIngredient(ingredient);
        Assert.assertFalse(burger.ingredients.isEmpty());


    }
    @Test
    public void testRemoveIngredient(){
        Burger burger = new Burger();
        burger.addIngredient(ingredient);
        burger.removeIngredient(0);
        Assert.assertTrue(burger.ingredients.isEmpty());


    }
    @Test
    public void testMoveIngredient(){
        Burger burger = new Burger();
        burger.addIngredient(ingredient);
        burger.addIngredient(ingredient_1);
        burger.moveIngredient(0, 1);
        Assert.assertEquals(0, burger.ingredients.indexOf(ingredient_1));


    }
    @Test
    public void testGetReceipt(){
        Burger burger = new Burger();
        Mockito.when(bun.getPrice()).thenReturn(5.5F);
        Mockito.when(bun.getName()).thenReturn("Бриошь");
        burger.setBuns(bun);
        Mockito.when(ingredient.getName()).thenReturn("Cыр");
        Mockito.when(ingredient.getType()).thenReturn(IngredientType.SAUCE);
        burger.addIngredient(ingredient);
        Assert.assertFalse(burger.getReceipt().isEmpty());


    }
}
