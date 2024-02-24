package com.decorator.dessignpattern.models;

public class Decaf extends Beverage {

  @Override
  public String getDescription() {
    return "This is a Decaf";
  }

  @Override
  public double cost() {
    return 1.05;
  }
}
