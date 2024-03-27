package com.designpattern.factorymethod.models;

import com.designpattern.factorymethod.interfaces.Ramen;

public class HokkaidoBeefRamen extends Ramen {

  public HokkaidoBeefRamen() {
    super("Hokkaido Beef ramen");
  }

  @Override
  public double calculateCost() {
    return 3.2;
  }
}
