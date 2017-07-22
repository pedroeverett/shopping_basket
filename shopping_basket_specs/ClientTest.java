import static org.junit.Assert.*;
import org.junit.*;
import shopping_basket_management.*;

public class ClientTest {

  Client client;

  @Before
  public void before() {
    client = new Client("Pedro", "1977-05-02", true);
  }

  @Test
  public void checkHasName() {
    assertEquals("Pedro", client.getName());
  }

  //The number of years on this test probably has to be updated when the test is run in the future, because this test is based on the current date.
  @Test
  public void checkHasAge() {
    assertEquals(40, client.getAge());
  }

  @Test
  public void checkHasLoyaltyCard() {
    assertEquals(true, client.getLoyaltyCard());
  }
}