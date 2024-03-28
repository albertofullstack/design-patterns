package com.designpattern.factorymethod.models;

import com.designpattern.factorymethod.interfaces.RamenRestaurant;

public class HokkaidoRamenRestaurant extends RamenRestaurant {

  @Override
  public Ramen createRamen(String type) {
    Ramen ramen = null;
    switch (type) {
      case "beef":
        ramen = new HokkaidoBeefRamen();
        break;
      case "pork":
        ramen = new HokkaidoPorkRamen();
        break;
      case "veggie":
        ramen = new HokkaidoVeggieRamen();
        break;
      default:
        break;
    }
    return ramen;
  }
}
