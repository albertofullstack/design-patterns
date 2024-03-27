package com.designpattern.factorymethod.interfaces;

import com.designpattern.factorymethod.interfaces.Ramen;

public abstract class RamenRestaurant {

  public Ramen orderRamen(String type) {

    Ramen ramen = createRamen(type);
    ramen.prepare();
    ramen.serve();
    System.out.println("Ramen price: " + ramen.calculateCost());
    return ramen;
  }

  protected abstract Ramen createRamen(String type);
}
