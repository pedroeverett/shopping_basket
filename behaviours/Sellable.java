package behaviours;

public interface Sellable {
  boolean getBuyOneGetOneFree();
  int getAgeRestriction();
  boolean checkExpirationDiscountApplies();
  void changePriceForBuyOneGetOneFree();
  void changePriceForExpirationDateDiscount();
}