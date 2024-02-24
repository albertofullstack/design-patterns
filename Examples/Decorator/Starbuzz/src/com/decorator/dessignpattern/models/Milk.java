package com.decorator.dessignpattern.models;

import com.decorator.dessignpattern.decorators.CondimentDecorator;

public class Milk extends CondimentDecorator {

  private Beverage beverage;

  public Milk(Beverage beverage) {
    this.beverage = beverage;
  }
  @Override
  public String getDescription() {
    return beverage.getDescription() + ", steamed milk";
  }

  @Override
  public double cost() {
    return .10 + beverage.cost();
  }
}
