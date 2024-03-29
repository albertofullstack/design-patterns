package com.designpatterns.factory.models;

import com.designpatterns.factory.interfaces.Ramen;

public class RamenFactory {

  public Ramen createRamen(String type) {
    Ramen ramen = null;
    if (type.equals("beef")) {
      ramen = new BeefRamen();
    } else if (type.equals("pork")) {
      ramen = new PorkRamen();
    } else if (type.equals("veggie")) {
      ramen = new VeggieRamen();
    }
    return ramen;
  }
}
