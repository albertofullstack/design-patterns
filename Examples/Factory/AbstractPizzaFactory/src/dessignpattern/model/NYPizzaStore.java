package dessignpattern.model;

public class NYPizzaStore extends PizzaStore {

  public Pizza createPizza(String type) {
    PizzaIngredientFactory pizzaFactoryIngredient = new NYPizzaIngredientFactory();
    Pizza pizza = null;
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
