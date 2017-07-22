package shopping_basket_management;

public class Chocolate extends Sweet {

  public String type;

  public Chocolate(String name, String brand, double price, int barCode, int ageRestriction, String expirationDate, boolean buyOneGetOneFree, String type) {
    super(name, brand, price, barCode, ageRestriction, expirationDate, buyOneGetOneFree);
    this.type = type;
  }

  public String getType() {
    return type;
  }

}