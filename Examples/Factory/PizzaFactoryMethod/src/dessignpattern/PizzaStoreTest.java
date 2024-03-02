package dessignpattern;


import dessignpattern.model.ChicagoPizzaStore;
import dessignpattern.model.NYPizzaStore;
import dessignpattern.model.PizzaStore;
import dessignpattern.model.SimplePizzaFactory;

public class PizzaStoreTest {

  public static void main(String[] args) {

    PizzaStore nyPizzaStore = new NYPizzaStore(new SimplePizzaFactory());
    nyPizzaStore.orderPizza("cheese");
    System.out.println("NY Pizza cheese - Order delivered");

    System.out.println();

    PizzaStore chicagoPizzaStore = new ChicagoPizzaStore(new SimplePizzaFactory());
    chicagoPizzaStore.orderPizza("cheese");
    System.out.println("Chicago Pizza cheese - Order delivered");
  }
}