package com.designpatterns.cof;

public class DirectorPurchasePower extends PurchasePower {

  @Override
  protected double getAllowable() {
    return BASE * 2000;
  }

  @Override
  protected String getRole() {
    return "Director";
  }
}
