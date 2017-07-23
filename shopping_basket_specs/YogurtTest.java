import static org.junit.Assert.*;
import org.junit.*;
import shopping_basket_management.*;

public class YogurtTest {

  Yogurt yogurt;

  @Before
  public void before() {
    yogurt = new Yogurt("Red Fruits", "Danone", 1.70, 135682, 0, "2017-08-10", false, "Black Berry");
  }

  @Test
  public void checkHasName() {
    assertEquals("Red Fruits", yogurt.getName());
  }

  @Test
  public void checkHasBrand() {
    assertEquals("Danone", yogurt.getBrand());
  }

  @Test
  public void checkHasPrice() {
    assertEquals(1.70, yogurt.getPrice(), 0.01);
  }

  @Test
  public void checkHasBarCode() {
    assertEquals(135682, yogurt.getBarCode());
  }

  @Test
  public void checkHasAgeRestriction() {
    assertEquals(0, yogurt.getAgeRestriction());
  }

  //The number of days on this test has to be updated when the test is run in the future, because this test is based on the current date.
  @Test
  public void checkDaysLeftToExpirationDate() {
    assertEquals(18, yogurt.getDaysLeftForExpirationDate());
  }

  @Test
  public void checkBuyOneGetOneFreeApplies() {
    assertEquals(false, yogurt.getBuyOneGetOneFree());
  }

  @Test
  public void checkHasFlavour() {
    assertEquals("Black Berry", yogurt.getFlavour());
  }

  @Test 
  public void checkExpirationDiscountApplies() {
    assertEquals(false, yogurt.checkExpirationDiscountApplies());
  }
}