package shopping_basket_management;
import behaviours.*;
import org.joda.time.LocalDate;
import org.joda.time.Days;

public abstract class Drink implements Sellable {
  protected String name;
  protected String brand;
  protected double price;
  protected int barCode;
  protected int ageRestriction;
  protected LocalDate expirationDate;
  protected boolean buyOneGetOneFree;

  public Drink(String name, String brand, double price, int barCode, int ageRestriction, String expirationDate, boolean buyOneGetOneFree) {
    this.name = name;
    this.brand = brand;
    this.price = price;
    this.barCode = barCode;
    this.ageRestriction = ageRestriction;
    this.expirationDate = LocalDate.parse(expirationDate);
    this.buyOneGetOneFree = buyOneGetOneFree;
  }

  public String getName() {
    return name;
  }

  public String getBrand() {
    return brand;
  }

  public double getPrice() {
    return price;
  }

  public int getBarcode() {
    return barCode;
  }

  public int getAgeRestriction() {
    return ageRestriction;
  }

  public int getDaysLeftForExpirationDate() {
    LocalDate today = LocalDate.now();
    int days = Days.daysBetween(new LocalDate(expirationDate), new LocalDate(today)).getDays(); 
    return days;
  }

  public boolean getBuyOneGetOneFree() {
    return buyOneGetOneFree;
  }


}