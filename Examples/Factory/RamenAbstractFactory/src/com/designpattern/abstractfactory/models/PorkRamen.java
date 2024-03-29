package com.designpattern.abstractfactory.models;

import com.designpattern.abstractfactory.interfaces.IngredientFactory;

public class PorkRamen extends Ramen {

  public PorkRamen(IngredientFactory ingredientFactory) {
    name = "Pork ramen";
    this.ingredientFactory = ingredientFactory;
  }

  @Override
  public void prepare() {
    ingredientFactory.createSoup();
    ingredientFactory.createNoodle();
  }
}
