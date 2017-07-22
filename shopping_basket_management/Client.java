package shopping_basket_management;

import org.joda.time.LocalDate;
import org.joda.time.Years;

public class Client {

  protected String name;
  protected LocalDate dateOfBirth;
  protected boolean loyaltyCard;

  public Client(String name, String dateOfBirth, boolean loyaltyCard) {
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

  public boolean getLoyaltyCard() {
    return loyaltyCard;
  }
}