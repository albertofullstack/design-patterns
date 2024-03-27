package com.designpatterns.factory.models;

import com.designpatterns.factory.interfaces.Ramen;

public class VeggieRamen extends Ramen {

  public VeggieRamen() {
    super("Veggie ramen");
  }

  @Override
  public double calculateCost() {
    return 2.3;
  }
}
