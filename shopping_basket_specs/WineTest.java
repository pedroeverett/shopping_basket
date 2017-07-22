import static org.junit.Assert.*;
import org.junit.*;
import shopping_basket_management.*;

public class WineTest {

  Wine wine;

  @Before
  public void before() {
    wine = new Wine("Borba", "Adega Borba", 7.00, 320321, 18, "2020-12-10", false, "Red");
  }

  @Test
  public void checkHasName() {
    assertEquals("Borba", wine.getName());
  }

  @Test
  public void checkHasBrand() {
    assertEquals("Adega Borba", wine.getBrand());
  }

  @Test
  public void checkHasPrice() {
    assertEquals(7.00, wine.getPrice(), 0.01);
  }
}