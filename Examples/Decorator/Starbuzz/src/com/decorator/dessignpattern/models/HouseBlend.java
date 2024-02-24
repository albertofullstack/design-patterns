package com.decorator.dessignpattern.models;

public class HouseBlend extends Beverage {

  @Override
  public String getDescription() {
    return "This is a HouseBlend";
  }

  @Override
  public double cost() {
    return .89;
  }
}
