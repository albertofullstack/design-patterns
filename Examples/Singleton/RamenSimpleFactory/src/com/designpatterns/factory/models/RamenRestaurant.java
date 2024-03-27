package com.designpatterns.factory.models;

import com.designpatterns.factory.interfaces.Ramen;

public class RamenRestaurant {

  private RamenFactory ramenFactory;

  public RamenRestaurant(RamenFactory ramenFactory) {
    this.ramenFactory = ramenFactory;
  }

  public Ramen orderRamen(String type) {

    Ramen ramen = ramenFactory.createRamen(type);
    ramen.prepare();
    ramen.serve();
    System.out.println("Ramen price: " + ramen.calculateCost());
    return ramen;
  }
}
