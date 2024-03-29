package com.designpattern.abstractfactory.interfaces;

import com.designpattern.abstractfactory.models.Noodle;
import com.designpattern.abstractfactory.models.Soup;

public interface IngredientFactory {

  public Soup createSoup();

  public Noodle createNoodle();
}
