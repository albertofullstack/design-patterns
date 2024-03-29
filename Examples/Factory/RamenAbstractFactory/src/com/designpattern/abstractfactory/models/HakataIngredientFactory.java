package com.designpattern.abstractfactory.models;

import com.designpattern.abstractfactory.interfaces.IngredientFactory;

public class HakataIngredientFactory implements IngredientFactory {

  @Override
  public Soup createSoup() {
    return new MisoSoup();
  }

  @Override
  public Noodle createNoodle() {
    return new ThickNoodle();
  }
}
