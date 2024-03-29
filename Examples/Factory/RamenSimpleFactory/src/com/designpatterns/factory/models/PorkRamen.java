package com.designpatterns.factory.models;

import com.designpatterns.factory.interfaces.Ramen;

public class PorkRamen extends Ramen {

  public PorkRamen() {
    super("Pork ramen");
  }

  @Override
  public double calculateCost() {
    return 4.8;
  }
}
