package shopping_basket_management;

public class Milk extends FreshFood {

  public String type;

  public Milk(String name, String brand, double price, int barCode, int ageRestriction, String expirationDate, boolean buyOneGetOneFree, String type) {
    super(name, brand, price, barCode, ageRestriction, expirationDate, buyOneGetOneFree);
    this.type = type;
  }

  public String gettype() {
    return type;
  }

  @Override
  public boolean checkExpirationDiscountApplies() {
    if (getDaysLeftForExpirationDate() <= 5) {
      return true;
    }
    return false;
  }
}