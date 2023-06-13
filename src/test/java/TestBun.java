import org.junit.Assert;
import org.junit.Test;
import praktikum.Bun;

public class TestBun {
    @Test
    public void testGetBunName(){
        Bun bun = new Bun("Бриошь", 4.5F);
        Assert.assertEquals("Бриошь", bun.getName());

    }
    @Test
    public void testGetBunPrice(){
        Bun bun = new Bun("Бриошь", 4.5F);
        Assert.assertEquals(4.5F, bun.getPrice(),0.0);

    }
}
