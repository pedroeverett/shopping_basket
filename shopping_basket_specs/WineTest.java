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

  @Test
  public void checkHasBarCode() {
    assertEquals(320321, wine.getBarCode());
  }

  @Test
  public void checkHasAgeRestriction() {
    assertEquals(18, wine.getAgeRestriction());
  }

  //The number of days on this test has to be updated when the test is run in the future, because this test is based on the current date.
  @Test
  public void checkDaysLeftToExpirationDate() {
    assertEquals(1236, wine.getDaysLeftForExpirationDate());
  }

  @Test
  public void checkBuyOneGetOneFreeApplies() {
    assertEquals(false, wine.getBuyOneGetOneFree());
  }

  @Test
  public void checkHasType() {
    assertEquals("Red", wine.getType());
  }

  @Test 
  public void checkExpirationDiscountApplies() {
    assertEquals(false, wine.checkExpirationDiscountApplies());
  }
}