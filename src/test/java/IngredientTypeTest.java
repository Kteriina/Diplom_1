import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.IngredientType;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(Parameterized.class)
public class IngredientTypeTest {
    private String ingredientType;

    public IngredientTypeTest(String ingredientType) {
        this.ingredientType = ingredientType;
    }
    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
                {"SAUCE"},
                {"FILLING"},
        };
    }

    @Test
    public void testIngredientTypeChecking() {
        assertThat(ingredientType.valueOf(ingredientType), is(notNullValue()));
    }
}
