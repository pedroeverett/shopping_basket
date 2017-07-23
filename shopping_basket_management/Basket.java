package shopping_basket_management;
import java.util.ArrayList;
import behaviours.*;


public class Basket {

  private int number;
  private double total;
  private Client[] client;
  private ArrayList<Sellable> productlist;

  public Basket(int number, double total) {
    this.number = number;
    this.total = total;
    this.client = new Client[1];
    this.productlist = new ArrayList<Sellable>();
  }  

  public int getNumber() {
    return number;
  }

  public double getTotal() {
    return total;
  }

  public int getNumberOfProducts() {
    int numberOfProducts = productlist.size();
    return numberOfProducts;
  }

  public int clientCount() {
    int numberOfClients = 0;

    for (Client clients : client) {
      if (clients != null) {
        numberOfClients++;
      }
    }

    return numberOfClients;
  }

  public void addClient(Client newClient) {
    client[0] = newClient; 
  }

  public boolean clientCanBuyProduct(Client newClient, Sellable newProduct) {
    if (newClient.getAge() >= newProduct.getAgeRestriction()) {
      return true;
    }
    return false;
  }
}
