package dessignpattern.model;

public class ChicagoStyleCheesePizza extends Pizza {

  public ChicagoStyleCheesePizza() {
    name = "Chicago Style Sauce and cheese pizza";
    dough = "Thick crust dough";
    sauce = "Tomato sauce";

    toppings.add("American cheese");
  }

  @Override
  public void cut() {
    System.out.println("Cutting the pizza into square slices");
  }
}
