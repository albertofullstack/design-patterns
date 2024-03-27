package com.designpattern.factorymethod.models;

import com.designpattern.factorymethod.interfaces.Ramen;

public class HakataBeefRamen extends Ramen {

  public HakataBeefRamen() {
    super("Hakata Beef ramen");
  }

  @Override
  public double calculateCost() {
    return 10.99;
  }
}
