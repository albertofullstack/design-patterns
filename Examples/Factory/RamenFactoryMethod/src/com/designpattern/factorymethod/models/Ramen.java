package com.designpattern.factorymethod.models;

import java.util.ArrayList;
import java.util.List;

public abstract class Ramen {

  String name;
  double price;
  String noodles;
  List<String> toppings = new ArrayList<>();

  public void prepare() {
    System.out.println("Preparing " + name);
    System.out.println("Stir fry aromatics");
    System.out.println("Making the broth");
    System.out.println("Adding noodles");
    System.out.println("Adding vegetables");
    System.out.println("Adding toppings");
    toppings.forEach(topping -> System.out.println("------>" + topping));
  }

  public void serve() {
    System.out.println("Serving " + name);
  }
}
