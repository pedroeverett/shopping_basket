package shopping_basket_management;

public class Juice extends Drink {

  public String fruit;

  public Juice(String name, String brand, double price, int barCode, int ageRestriction, String expirationDate, boolean buyOneGetOneFree, String fruit) {
    super(name, brand, price, barCode, ageRestriction, expirationDate, buyOneGetOneFree);
    this.fruit = fruit;
  }

  public String getFruit() {
    return fruit;
  }
}