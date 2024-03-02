package dessignpattern;


import dessignpattern.model.ChicagoPizzaStore;
import dessignpattern.model.NYPizzaStore;
import dessignpattern.model.PizzaStore;

public class PizzaStoreTest {

  public static void main(String[] args) {

    PizzaStore nyPizzaStore = new NYPizzaStore();
    nyPizzaStore.orderPizza("cheese");
    System.out.println("NY Pizza cheese - Order delivered");

    nyPizzaStore.orderPizza("veggie");
    System.out.println("NY Pizza cheese - Order delivered");

    System.out.println();

    PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
    chicagoPizzaStore.orderPizza("cheese");
    chicagoPizzaStore.orderPizza("clam");
    System.out.println("Chicago Pizza cheese - Order delivered");
  }
}