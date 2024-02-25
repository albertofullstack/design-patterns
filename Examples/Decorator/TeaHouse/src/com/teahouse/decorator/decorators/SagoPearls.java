package com.teahouse.decorator.decorators;

import com.teahouse.decorator.models.Tea;

public class SagoPearls extends CondimentsDecorator {

  private Tea tea;

  public SagoPearls(Tea tea) {
    this.tea = tea;
  }

  @Override
  public double cost() {
    return 0.5 + tea.cost();
  }

  @Override
  public String getName() {
    return tea.getName() + " , sago pearls";
  }
}
