package behaviours;

public interface Sellable {
  double getPrice();
  boolean getBuyOneGetOneFree();
  int getAgeRestriction();
  boolean checkExpirationDiscountApplies();
  void changePriceForBuyOneGetOneFree();
  void changePriceForExpirationDateDiscount();
}