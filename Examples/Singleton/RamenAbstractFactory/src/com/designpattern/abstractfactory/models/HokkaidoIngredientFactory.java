package com.designpattern.abstractfactory.models;

import com.designpattern.abstractfactory.interfaces.IngredientFactory;

public class HokkaidoIngredientFactory implements IngredientFactory {

  @Override
  public Soup createSoup() {
    return new SmoothSoup();
  }

  @Override
  public Noodle createNoodle() {
    return new FirmNoodle();
  }
}
