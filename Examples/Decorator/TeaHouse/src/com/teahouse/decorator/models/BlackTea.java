package com.teahouse.decorator.models;

public class BlackTea extends Tea {

  @Override
  public double cost() {
    return 2.4;
  }

  @Override
  public String getName() {
    return "Black Tea";
  }
}
