package dessignpattern.model;

import dessignpattern.model.ingredients.Cheese;
import dessignpattern.model.ingredients.Clams;
import dessignpattern.model.ingredients.Dough;
import dessignpattern.model.ingredients.Pepperoni;
import dessignpattern.model.ingredients.Sauce;
import dessignpattern.model.ingredients.Veggies;

public interface PizzaIngredientFactory {

  public Dough createDough();
  public Sauce createSauce();
  public Cheese createCheese();
  public Veggies[] createVeggies();
  public Pepperoni createPepperoni();
  public Clams createClam();
}
