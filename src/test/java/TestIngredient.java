import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Bun;
import praktikum.Ingredient;
import praktikum.IngredientType;

import java.util.List;

import static praktikum.IngredientType.SAUCE;

public class TestIngredient {
    @Test
    public void testGetIngredientName(){
        Ingredient ingredient = new Ingredient(SAUCE, "Сыр", 4.5F);
        Assert.assertEquals("Сыр", ingredient.getName());

    }
    @Test
    public void testGetIngredientPrice(){
        Ingredient ingredient = new Ingredient(SAUCE, "Сыр", 4.5F);
        Assert.assertEquals(4.5F, ingredient.getPrice(),0);

    }
    @Test
    public void testGetIngredientType(){
        Ingredient ingredient = new Ingredient(SAUCE, "Сыр", 4.5F);
        Assert.assertEquals(SAUCE, ingredient.getType());
        System.out.println(ingredient.getType());

    }

}
