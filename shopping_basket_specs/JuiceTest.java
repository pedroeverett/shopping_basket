import static org.junit.Assert.*;
import org.junit.*;
import shopping_basket_management.*;

public class JuiceTest {

  Juice juice;

  @Before
  public void before() {
    juice = new Juice("Orange Wonder", "Compal", 2.00, 532456, 0, "2017-12-10", true, "Orange");
  }

  @Test
  public void checkHasName() {
    assertEquals("Orange Wonder", juice.getName());
  }

  @Test
  public void checkHasBrand() {
    assertEquals("Compal", juice.getBrand());
  }

  @Test
  public void checkHasPrice() {
    assertEquals(2.00, juice.getPrice(), 0.01);
  }

  @Test
  public void checkHasBarCode() {
    assertEquals(532456, juice.getBarCode());
  }

  @Test
  public void checkHasAgeRestriction() {
    assertEquals(0, juice.getAgeRestriction());
  }

  //The number of days on this test has to be updated when the test is run in the future, because this test is based on the current date.
  @Test
  public void checkDaysLeftToExpirationDate() {
    assertEquals(141, juice.getDaysLeftForExpirationDate());
  }

  @Test
  public void checkBuyOneGetOneFreeApplies() {
    assertEquals(true, juice.getBuyOneGetOneFree());
  }

  @Test
  public void checkHasFruit() {
    assertEquals("Orange", juice.getFruit());
  }

  @Test 
  public void checkExpirationDiscountApplies() {
    assertEquals(false, juice.checkExpirationDiscountApplies());
  }
}