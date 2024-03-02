package dessignpattern.model;

import dessignpattern.model.ingredients.BlackOlives;
import dessignpattern.model.ingredients.Cheese;
import dessignpattern.model.ingredients.Clams;
import dessignpattern.model.ingredients.Dough;
import dessignpattern.model.ingredients.Eggplant;
import dessignpattern.model.ingredients.FrozenClams;
import dessignpattern.model.ingredients.MozzarellaCheese;
import dessignpattern.model.ingredients.Pepperoni;
import dessignpattern.model.ingredients.PlumTomatoSauce;
import dessignpattern.model.ingredients.Sauce;
import dessignpattern.model.ingredients.SlicedPepperoni;
import dessignpattern.model.ingredients.Spinach;
import dessignpattern.model.ingredients.ThickCrustDough;
import dessignpattern.model.ingredients.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

  public Dough createDough() {
    return new ThickCrustDough();
  }

  public Sauce createSauce() {
    return new PlumTomatoSauce();
  }

  public Cheese createCheese() {
    return new MozzarellaCheese();
  }

  public Veggies[] createVeggies() {
    Veggies veggies[] = { new BlackOlives(),
        new Spinach(),
        new Eggplant() };
    return veggies;
  }

  public Pepperoni createPepperoni() {
    return new SlicedPepperoni();
  }

  public Clams createClam() {
    return new FrozenClams();
  }
}
