package com.decorator.dessignpattern.decorators;

import com.decorator.dessignpattern.models.Beverage;

public abstract class CondimentDecorator extends Beverage {

  public abstract String getDescription();
}
