package com.decorator.dessignpattern.models;

public class DarkRoast extends Beverage {

  @Override
  public String getDescription() {
    return "This is a DarkRoast";
  }

  @Override
  public double cost() {
    return 0.99;
  }
}
