import static org.junit.Assert.*;
import org.junit.*;
import shopping_basket_management.*;

public class BasketTest {

  Basket basket;
  Client client;
  Chocolate chocolate;
  Cookie cookie;
  Juice juice;
  Milk milk;
  Wine wine;
  Yogurt yogurt;

  @Before
  public void before() {
    basket = new Basket(1, 0);
    client = new Client("Pedro", "1977-05-02", true);
    chocolate = new Chocolate("Black Chocolate", "Cadbury", 1.10, 890123, 0, "2017-09-10", false, "Black");
    cookie = new Cookie("Double Chocolate", "Lovemore", 0.90, 789334, 0, "2017-08-15", false, "Chocolate");
    juice = new Juice("Orange Wonder", "Compal", 2.00, 532456, 0, "2017-12-10", true, "Orange");
    milk = new Milk("Daily Milk", "Cravendale", 0.85, 600311, 0, "2017-08-05", false, "Whole");
    wine = new Wine("Borba", "Adega Borba", 7.00, 320321, 18, "2020-12-10", false, "Red");
    yogurt = new Yogurt("Red Fruits", "Danone", 1.70, 135682, 0, "2017-08-10", false, "Black Berry");
  }

  @Test
  public void checkHasNumber() {
    assertEquals(1, basket.getNumber());
  }
}