package dessignpattern.model;

import java.util.ArrayList;

abstract public class Pizza {

  String name;
  String dough;
  String sauce;
  ArrayList toppings = new ArrayList();

  public String getName() {
    return name;
  }

  public void prepare() {
    System.out.println("Preparing " + name);
    System.out.println("Tossing dough...");
    System.out.println("Adding sauce...");
    System.out.println("Adding toppings: ");
    for (Object o: toppings) {
      System.out.println("   " + o);
    }
  }

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
    // code to display pizza name and ingredients
    StringBuffer display = new StringBuffer();
    display.append("---- " + name + " ----\n");
    display.append(dough + "\n");
    display.append(sauce + "\n");
    for (int i = 0; i < toppings.size(); i++) {
      display.append((String) toppings.get(i) + "\n");
    }
    return display.toString();
  }
}
