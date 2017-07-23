import static org.junit.Assert.*;
import org.junit.*;
import shopping_basket_management.*;

public class CookieTest {

  Cookie cookie;

  @Before
  public void before() {
    cookie = new Cookie("Double Chocolate", "Lovemore", 1.00, 789334, 0, "2017-08-15", false, "Chocolate");
  }

  @Test
  public void checkHasName() {
    assertEquals("Double Chocolate", cookie.getName());
  }

  @Test
  public void checkHasBrand() {
    assertEquals("Lovemore", cookie.getBrand());
  }

  @Test
  public void checkHasPrice() {
    assertEquals(1.00, cookie.getPrice(), 0.01);
  }

  @Test
  public void checkHasBarCode() {
    assertEquals(789334, cookie.getBarCode());
  }

  @Test
  public void checkHasAgeRestriction() {
    assertEquals(0, cookie.getAgeRestriction());
  }

  //The number of days on this test has to be updated when the test is run in the future, because this test is based on the current date.
  @Test
  public void checkDaysLeftToExpirationDate() {
    assertEquals(23, cookie.getDaysLeftForExpirationDate());
  }

  @Test
  public void checkBuyOneGetOneFreeApplies() {
    assertEquals(false, cookie.getBuyOneGetOneFree());
  }

  @Test
  public void checkHasFlavour() {
    assertEquals("Chocolate", cookie.getFlavour());
  }

  @Test 
  public void checkExpirationDiscountApplies() {
    assertEquals(true, cookie.checkExpirationDiscountApplies());
  }

  @Test
  public void checkChangePriceForExpirationDateDiscount() {
    cookie.changePriceForExpirationDateDiscount();
    assertEquals(0.70, cookie.getPrice(), 0.01);
  }
}