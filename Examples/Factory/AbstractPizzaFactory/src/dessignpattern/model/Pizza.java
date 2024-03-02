package dessignpattern.model;

import dessignpattern.model.ingredients.Cheese;
import dessignpattern.model.ingredients.Clams;
import dessignpattern.model.ingredients.Dough;
import dessignpattern.model.ingredients.Pepperoni;
import dessignpattern.model.ingredients.Sauce;
import dessignpattern.model.ingredients.Veggies;

abstract public class Pizza {

  String name;
  Dough dough;
  Sauce sauce;
  Veggies veggies[];
  Cheese cheese;
  Pepperoni pepperoni;
  Clams clam;

  public String getName() {
    return name;
  }

  abstract void prepare();

  public void bake() {
    System.out.println("Baking " + name);
  }

  public void cut() {
    System.out.println("Cutting " + name);
  }

  public void box() {
    System.out.println("Boxing " + name);
  }

  public String toString() {
    StringBuffer result = new StringBuffer();
    result.append("---- " + name + " ----\n");
    if (dough != null) {
      result.append(dough);
      result.append("\n");
    }
    if (sauce != null) {
      result.append(sauce);
      result.append("\n");
    }
    if (cheese != null) {
      result.append(cheese);
      result.append("\n");
    }
    if (veggies != null) {
      for (int i = 0; i < veggies.length; i++) {
        result.append(veggies[i]);
        if (i < veggies.length-1) {
          result.append(", ");
        }
      }
      result.append("\n");
    }
    if (clam != null) {
      result.append(clam);
      result.append("\n");
    }
    if (pepperoni != null) {
      result.append(pepperoni);
      result.append("\n");
    }
    return result.toString();
  }
}
