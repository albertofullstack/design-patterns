package dessignpattern.model;

import dessignpattern.model.ingredients.Cheese;
import dessignpattern.model.ingredients.Clams;
import dessignpattern.model.ingredients.Dough;
import dessignpattern.model.ingredients.FreshClams;
import dessignpattern.model.ingredients.Garlic;
import dessignpattern.model.ingredients.MarinaraSauce;
import dessignpattern.model.ingredients.Mushroom;
import dessignpattern.model.ingredients.Onion;
import dessignpattern.model.ingredients.Pepperoni;
import dessignpattern.model.ingredients.RedPepper;
import dessignpattern.model.ingredients.ReggianoCheese;
import dessignpattern.model.ingredients.Sauce;
import dessignpattern.model.ingredients.SlicedPepperoni;
import dessignpattern.model.ingredients.ThinCrustDough;
import dessignpattern.model.ingredients.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

  public Dough createDough() {
    return new ThinCrustDough();
  }

  public Sauce createSauce() {
    return new MarinaraSauce();
  }

  public Cheese createCheese() {
    return new ReggianoCheese();
  }

  public Veggies[] createVeggies() {
    Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
    return veggies;
  }

  public Pepperoni createPepperoni() {
    return new SlicedPepperoni();
  }

  public Clams createClam() {
    return new FreshClams();
  }
}
