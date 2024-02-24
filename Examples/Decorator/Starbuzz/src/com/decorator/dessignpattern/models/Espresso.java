package com.decorator.dessignpattern.models;

public class Espresso extends Beverage {

  @Override
  public String getDescription() {
    return "This is a Espresso";
  }

  @Override
  public double cost() {
    return 1.99;
  }
}
