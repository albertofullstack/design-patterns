package com.designpattern.factorymethod.models;

import com.designpattern.factorymethod.interfaces.Ramen;

public class HokkaidoVeggieRamen extends Ramen {

  public HokkaidoVeggieRamen() {
    super("Hokkaido Veggie ramen");
  }

  @Override
  public double calculateCost() {
    return 2.3;
  }
}
