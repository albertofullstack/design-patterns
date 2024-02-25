package com.teahouse.decorator.models;

public class RedTea extends Tea {

  @Override
  public String getName() {
    return "Red Tea";
  }

  @Override
  public double cost() {
    return 5.6;
  }
}
