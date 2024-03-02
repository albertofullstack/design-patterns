package dessignpattern;


import dessignpattern.model.ChicagoPizzaStore;
import dessignpattern.model.NYPizzaStore;
import dessignpattern.model.PizzaStore;

public class PizzaStoreTest {

  public static void main(String[] args) {

    PizzaStore nyPizzaStore = new NYPizzaStore();
    System.out.println("Ordering NY Cheese Pizza");
    nyPizzaStore.orderPizza("cheese");
    System.out.println("NY Cheese Pizza - Order delivered");

    System.out.println();
    System.out.println("Ordering NY Veggie Pizza");
    nyPizzaStore.orderPizza("veggie");
    System.out.println("NY Veggie Pizza - Order delivered");

    System.out.println();

    PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
    System.out.println("Ordering Chicago Cheese Pizza");
    chicagoPizzaStore.orderPizza("cheese");
    System.out.println("Chicago Cheese Pizza - Order delivered");
    System.out.println();

    System.out.println("Ordering Chicago Clam Pizza");
    chicagoPizzaStore.orderPizza("clam");
    System.out.println("Chicago Clam Pizza - Order delivered");
  }
}