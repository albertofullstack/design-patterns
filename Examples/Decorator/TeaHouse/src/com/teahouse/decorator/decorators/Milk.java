package com.teahouse.decorator.decorators;

import com.teahouse.decorator.models.Tea;

public class Milk extends CondimentsDecorator {

  private Tea tea;

  public Milk(Tea tea) {
    this.tea = tea;
  }

  @Override
  public double cost() {
    return 0.2 + tea.cost();
  }

  @Override
  public String getName() {
    return tea.getName() + " , milk";
  }
}
