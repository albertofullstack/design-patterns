package com.designpattern.factorymethod.models;

import com.designpattern.factorymethod.interfaces.RamenRestaurant;

public class HakataRamenRestaurant extends RamenRestaurant {

  @Override
  public Ramen createRamen(String type) {
    Ramen ramen = null;
    if (type.equals("beef")) {
      ramen = new HakataBeefRamen();
    } else if (type.equals("pork")) {
      ramen = new HakataBeefRamen();
    } else if (type.equals("veggie")) {
      ramen = new HakataVeggieRamen();
    }
    return ramen;
  }
}
