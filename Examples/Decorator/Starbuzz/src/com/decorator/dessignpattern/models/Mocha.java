package com.decorator.dessignpattern.models;

import com.decorator.dessignpattern.decorators.CondimentDecorator;

public class Mocha extends CondimentDecorator {

  private Beverage beverage;

  public Mocha(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", mocha";
  }

  @Override
  public double cost() {
    return .20 + beverage.cost();
  }
}
