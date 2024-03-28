package com.designpattern.abstractfactory.models;

import com.designpattern.abstractfactory.interfaces.IngredientFactory;
import java.util.Arrays;

public class BeefRamen extends Ramen {

  public BeefRamen(IngredientFactory ingredientFactory) {
    this.ingredientFactory = ingredientFactory;
  }

  @Override
  public void prepare() {

  }
}
