package com.designpattern.abstractfactory.models;

import com.designpattern.abstractfactory.interfaces.IngredientFactory;
import com.designpattern.abstractfactory.interfaces.RamenRestaurant;

public class HokkaidoRamenRestaurant extends RamenRestaurant {

  @Override
  public Ramen createRamen(String type) {

    IngredientFactory ingredientFactory = new HokkaidoIngredientFactory();
    Ramen ramen = null;
    switch (type) {
      case "beef":
        ramen = new BeefRamen(ingredientFactory);
        break;
      case "pork":
        ramen = new PorkRamen(ingredientFactory);
        break;
      case "veggie":
        ramen = new VeggieRamen(ingredientFactory);
        break;
      default:
        break;
    }
    return ramen;
  }
}
