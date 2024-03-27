package com.designpattern.factorymethod.models;

import com.designpattern.factorymethod.interfaces.Ramen;
import com.designpattern.factorymethod.interfaces.RamenRestaurant;

public class HokkaidoRamenRestaurant extends RamenRestaurant {

  @Override
  public Ramen createRamen(String type) {
    Ramen ramen = null;
    if (type.equals("beef")) {
      ramen = new HokkaidoBeefRamen();
    } else if (type.equals("pork")) {
      ramen = new HokkaidoPorkRamen();
    } else if (type.equals("veggie")) {
      ramen = new HokkaidoVeggieRamen();
    }
    return ramen;
  }
}
