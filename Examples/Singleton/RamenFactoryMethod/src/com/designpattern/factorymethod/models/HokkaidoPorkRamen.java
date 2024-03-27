package com.designpattern.factorymethod.models;

import com.designpattern.factorymethod.interfaces.Ramen;

public class HokkaidoPorkRamen extends Ramen {

  public HokkaidoPorkRamen() {
    super("Hokkaido Pork ramen");
  }

  @Override
  public double calculateCost() {
    return 4.8;
  }
}
