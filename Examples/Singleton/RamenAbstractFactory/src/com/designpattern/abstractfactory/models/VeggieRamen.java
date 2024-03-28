package com.designpattern.abstractfactory.models;

import com.designpattern.abstractfactory.interfaces.IngredientFactory;

public class VeggieRamen extends Ramen {

  public VeggieRamen(IngredientFactory ingredientFactory) {
    name = "Veggie ramen";
    price = 2.3;
    protein = new Tofu();
    this.ingredientFactory = ingredientFactory;
  }

  @Override
  public void prepare() {
    ingredientFactory.createNoodle();
    ingredientFactory.createSoup();
  }
}
