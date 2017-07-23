package shopping_basket_management;
import java.util.ArrayList;
import behaviours.*;


public class Basket {

  private int number;
  private double total;
  private Client[] clientArray;
  private ArrayList<Sellable> productList;

  public Basket(int number, double total) {
    this.number = number;
    this.total = total;
    this.clientArray = new Client[1];
    this.productList = new ArrayList<Sellable>();
  }  

  public int getNumber() {
    return number;
  }

  public double getTotal() {
    return total;
  }

  public int getNumberOfProducts() {
    int numberOfProducts = productList.size();
    return numberOfProducts;
  }

  public int clientCount() {
    int numberOfClients = 0;

    for (Client clients : clientArray) {
      if (clients != null) {
        numberOfClients++;
      }
    }

    return numberOfClients;
  }

  public void addClient(Client newClient) {
    clientArray[0] = newClient; 
  }

  public boolean clientCanBuyProduct(Sellable newProduct) {
    if (clientArray[0].getAge() >= newProduct.getAgeRestriction()) {
      return true;
    }
    return false;
  }

  public boolean producHasBuyOneGetOneFree(Sellable newProduct) {
    return newProduct.getBuyOneGetOneFree();
  }

  public boolean checkProductExpirationDiscountApplies(Sellable newProduct) {
    return newProduct.checkExpirationDiscountApplies();
  }

  // public void addProduct(Sellable newProduct) {
  //   if (clientCanBuyProduct(newProduct) == false) {
  //     return;
  //   }
  //   if (producHasBuyOneGetOneFree(newProduct) == true) {

  //   }
  // }
  
  // public void addProduct(Sellable newProduct) {
  //   if (clientCanBuyProduct(newProduct) == false) {
  //     return;
  //   }
  //   if (checkProductExpirationDiscountApplies(newProduct) == true) {
  //     newProduct.changePriceForExpirationDateDiscount();
  //     productList.add(newProduct);
  //   } else {
  //   productList.add(newProduct);
  // }
  // }
}
