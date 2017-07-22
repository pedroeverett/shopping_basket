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
  public void checkWineName() {
    assertEquals("Borba", wine.getName());
  }
}