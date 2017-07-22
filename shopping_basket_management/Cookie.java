package shopping_basket_management;

public class Cookie extends Sweet {

  public String flavour;

  public Cookie(String name, String brand, double price, int barCode, int ageRestriction, String expirationDate, boolean buyOneGetOneFree, String flavour) {
    super(name, brand, price, barCode, ageRestriction, expirationDate, buyOneGetOneFree);
    this.flavour = flavour;
  }

  public String getFlavour() {
    return flavour;
  }

}