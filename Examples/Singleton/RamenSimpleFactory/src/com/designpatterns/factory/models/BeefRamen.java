package com.designpatterns.factory.models;

import com.designpatterns.factory.interfaces.Ramen;

public class BeefRamen extends Ramen {

  public BeefRamen() {
    super("Beef ramen");
  }

  @Override
  public double calculateCost() {
    return 3.2;
  }
}
