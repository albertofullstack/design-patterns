package com.designpattern.abstractfactory.models;

import com.designpattern.abstractfactory.interfaces.IngredientFactory;
import java.util.Arrays;

public class BeefRamen extends Ramen {

  public BeefRamen(IngredientFactory ingredientFactory) {
    name = "Beef ramen";
    this.ingredientFactory = ingredientFactory;
  }

  @Override
  public void prepare() {

  }
}
