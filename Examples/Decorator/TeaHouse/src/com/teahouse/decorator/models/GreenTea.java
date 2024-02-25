package com.teahouse.decorator.models;

public class GreenTea extends Tea {

  @Override
  public double cost() {
    return 4.5;
  }

  @Override
  public String getName() {
    return "Green Tea";
  }
}
