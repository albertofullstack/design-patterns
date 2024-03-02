package dessignpattern.model;

public class NYPizzaStore extends PizzaStore {

  private PizzaIngredientFactory pizzaFactoryIngredient;

  public NYPizzaStore (PizzaIngredientFactory pizzaFactoryIngredient) {
    this.pizzaFactoryIngredient = pizzaFactoryIngredient;
  }
  public Pizza createPizza(String type) {
    Pizza pizza = null;
    if (type.equals("cheese")) {
      pizza = new NYStyleCheesePizza();
    } else if (type.equals("pepperoni")) {
      pizza = new NYStylePepperoniPizza();
    } else if (type.equals("clam")) {
      pizza = new NYStyleClamPizza();
    } else if (type.equals("veggie")) {
      pizza = new NYStyleVeggiePizza();
    }
    return pizza;
  }
}
