package com.designpattern.abstractfactory.models;

import com.designpattern.abstractfactory.interfaces.IngredientFactory;
import java.util.ArrayList;
import java.util.List;

public abstract class Ramen {

  String name;
  double price;
  Noodle noodles;
  Soup soup;
  Protein protein;

  IngredientFactory ingredientFactory;

  public abstract void prepare();

  public void serve() {
    System.out.println("Serving " + name);
  }
}
