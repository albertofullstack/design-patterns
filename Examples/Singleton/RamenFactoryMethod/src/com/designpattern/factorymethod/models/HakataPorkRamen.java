package com.designpattern.factorymethod.models;

import com.designpattern.factorymethod.interfaces.Ramen;

public class HakataPorkRamen extends Ramen {

  public HakataPorkRamen() {
    super("Hakata Pork ramen");
  }

  @Override
  public double calculateCost() {
    return 2.3;
  }
}
