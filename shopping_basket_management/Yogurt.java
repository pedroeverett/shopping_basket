package shopping_basket_management;

public class Yogurt extends FreshFood {

  public String flavour;

  public Yogurt(String name, String brand, double price, int barCode, int ageRestriction, String expirationDate, boolean buyOneGetOneFree, String flavour) {
    super(name, brand, price, barCode, ageRestriction, expirationDate, buyOneGetOneFree);
    this.flavour = flavour;
  }

  public String getFlavour() {
    return flavour;
  }

  @Override
  public boolean checkExpirationDiscountApplies() {
    if (getDaysLeftForExpirationDate() <= 10) {
      return true;
    }
    return false;
  }
}