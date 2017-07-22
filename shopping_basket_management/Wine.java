package shopping_basket_management;

public class Wine extends Drink {

  public String type;

  public Wine(String name, String brand, double price, int barCode, int ageRestriction, String expirationDate, boolean buyOneGetOneFree, String type) {
    super(name, brand, price, barCode, ageRestriction, expirationDate, buyOneGetOneFree);
    this.type = type;
  }

  public String getType() {
    return type;
  }
}