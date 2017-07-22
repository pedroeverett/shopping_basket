import static org.junit.Assert.*;
import org.junit.*;
import shopping_basket_management.*;

public class ChocolateTest {

  Chocolate chocolate;

  @Before
  public void before() {
    chocolate = new Chocolate("Black Chocolate", "Cadbury", 1.10, 890123, 0, "2017-09-10", false, "Black");
  }

  @Test
  public void checkHasName() {
    assertEquals("Black Chocolate", chocolate.getName());
  }

  @Test
  public void checkHasBrand() {
    assertEquals("Cadbury", chocolate.getBrand());
  }

  @Test
  public void checkHasPrice() {
    assertEquals(1.10, chocolate.getPrice(), 0.01);
  }

  @Test
  public void checkHasBarCode() {
    assertEquals(890123, chocolate.getBarCode());
  }

  @Test
  public void checkHasAgeRestriction() {
    assertEquals(0, chocolate.getAgeRestriction());
  }

  //The number of days on this test has to be updated when the test is run in the future, because this test is based on the current date.
  @Test
  public void checkDaysLeftToExpirationDate() {
    assertEquals(50, chocolate.getDaysLeftForExpirationDate());
  }

  @Test
  public void checkBuyOneGetOneFreeApplies() {
    assertEquals(false, chocolate.getBuyOneGetOneFree());
  }

  @Test
  public void checkHasType() {
    assertEquals("Black", chocolate.getType());
  }

  @Test 
  public void checkExpirationDiscountApplies() {
    assertEquals(false, chocolate.checkExpirationDiscountApplies());
  }
}