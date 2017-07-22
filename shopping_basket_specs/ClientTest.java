import static org.junit.Assert.*;
import org.junit.*;
import shopping_basket_management.*;

public class ClientTest {

  Client client;

  @Before
  public void before() {
    client = new Client("Pedro", "1977-05-02", "yes");
  }

  @Test
  public void checkHasName() {
    assertEquals("Pedro", client.getName());
  }

  @Test
  public void checkHasAge() {
    assertEquals(40, client.getAge());
  }

  @Test
  public void checkHasLoyaltyCard() {
    assertEquals(true, client.checkLoyaltyCard());
  }
}