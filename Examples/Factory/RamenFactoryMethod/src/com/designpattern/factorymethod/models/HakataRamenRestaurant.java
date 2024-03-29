package com.designpattern.factorymethod.models;

import com.designpattern.factorymethod.interfaces.RamenRestaurant;

public class HakataRamenRestaurant extends RamenRestaurant {

  @Override
  public Ramen createRamen(String type) {
    Ramen ramen = null;
    switch (type) {
      case "beef":
        ramen = new HakataBeefRamen();
        break;
      case "pork":
        ramen = new HakataBeefRamen();
        break;
      case "veggie":
        ramen = new HakataVeggieRamen();
        break;
    }
    return ramen;
  }
}
