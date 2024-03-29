package dessignpattern;


import dessignpattern.model.ChicagoPizzaIngredientFactory;
import dessignpattern.model.ChicagoPizzaStore;
import dessignpattern.model.NYPizzaIngredientFactory;
import dessignpattern.model.NYPizzaStore;
import dessignpattern.model.Pizza;
import dessignpattern.model.PizzaStore;

public class PizzaStoreTest {

  public static void main(String[] args) {

    PizzaStore nyStore = new NYPizzaStore();
    PizzaStore chicagoStore = new ChicagoPizzaStore();

    Pizza pizza = nyStore.orderPizza("cheese");
    System.out.println("Ethan ordered a " + pizza + "\n");

    pizza = chicagoStore.orderPizza("cheese");
    System.out.println("Joel ordered a " + pizza + "\n");

    pizza = nyStore.orderPizza("clam");
    System.out.println("Ethan ordered a " + pizza + "\n");

    pizza = chicagoStore.orderPizza("clam");
    System.out.println("Joel ordered a " + pizza + "\n");

    pizza = nyStore.orderPizza("pepperoni");
    System.out.println("Ethan ordered a " + pizza + "\n");

    pizza = chicagoStore.orderPizza("pepperoni");
    System.out.println("Joel ordered a " + pizza + "\n");

    pizza = nyStore.orderPizza("veggie");
    System.out.println("Ethan ordered a " + pizza + "\n");

    pizza = chicagoStore.orderPizza("veggie");
    System.out.println("Joel ordered a " + pizza + "\n");
  }
}