package com.designpattern.factorymethod.models;

import com.designpattern.factorymethod.interfaces.Ramen;

public class HakataVeggieRamen extends Ramen {

  public HakataVeggieRamen() {
    super("Hakata Veggie ramen");
  }

  @Override
  public double calculateCost() {
    return 0.1;
  }
}
