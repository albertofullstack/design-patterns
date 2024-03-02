package dessignpattern.model;

public class ChicagoPizzaStore extends PizzaStore {

  public Pizza createPizza(String type) {
    Pizza pizza = null;
    PizzaIngredientFactory pizzaFactoryIngredient = new ChicagoPizzaIngredientFactory();
    if (type.equals("cheese")) {
      pizza = new CheesePizza(pizzaFactoryIngredient);
    } else if (type.equals("pepperoni")) {
      pizza = new PepperoniPizza(pizzaFactoryIngredient);
    } else if (type.equals("clam")) {
      pizza = new ClamPizza(pizzaFactoryIngredient);
    } else if (type.equals("veggie")) {
      pizza = new VeggiePizza(pizzaFactoryIngredient);
    }
    return pizza;
  }
}
