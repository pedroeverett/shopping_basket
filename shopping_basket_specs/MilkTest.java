import static org.junit.Assert.*;
import org.junit.*;
import shopping_basket_management.*;

public class MilkTest {

  Milk milk;

  @Before
  public void before() {
    milk = new Milk("Daily Milk", "Cravendale", 0.85, 600311, 0, "2017-08-05", false, "Whole");
  }

  @Test
  public void checkHasName() {
    assertEquals("Daily Milk", milk.getName());
  }

  @Test
  public void checkHasBrand() {
    assertEquals("Cravendale", milk.getBrand());
  }

  @Test
  public void checkHasPrice() {
    assertEquals(0.85, milk.getPrice(), 0.01);
  }

  @Test
  public void checkHasBarCode() {
    assertEquals(600311, milk.getBarCode());
  }

  @Test
  public void checkHasAgeRestriction() {
    assertEquals(0, milk.getAgeRestriction());
  }

  //The number of days on this test has to be updated when the test is run in the future, because this test is based on the current date.
  @Test
  public void checkDaysLeftToExpirationDate() {
    assertEquals(14, milk.getDaysLeftForExpirationDate());
  }

  @Test
  public void checkBuyOneGetOneFreeApplies() {
    assertEquals(false, milk.getBuyOneGetOneFree());
  }

  @Test
  public void checkHasType() {
    assertEquals("Whole", milk.getType());
  }

  @Test 
  public void checkExpirationDiscountApplies() {
    assertEquals(false, milk.checkExpirationDiscountApplies());
  }
}