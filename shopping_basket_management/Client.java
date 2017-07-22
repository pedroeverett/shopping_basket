package shopping_basket_management;

import org.joda.time.LocalDate;
import org.joda.time.Years;

public class Client {

  protected String name;
  protected LocalDate dateOfBirth;
  protected String loyaltyCard;

  public Client(String name, String dateOfBirth, String loyaltyCard) {
    this.name = name;
    this.dateOfBirth = LocalDate.parse(dateOfBirth);
    this.loyaltyCard = loyaltyCard;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    LocalDate today = LocalDate.now();
    int years = Years.yearsBetween(new LocalDate(dateOfBirth), new LocalDate(today)).getYears(); 
    return years;
  }

  public boolean checkLoyaltyCard() {
    if (loyaltyCard == "yes") {
      return true;
    }
    return false;
  }
}