package com.teahouse.decorator.decorators;

import com.teahouse.decorator.models.Tea;

public class NataDeCoco extends CondimentsDecorator {

  private Tea tea;

  public NataDeCoco(Tea tea) {
    this.tea = tea;
  }

  @Override
  public double cost() {
    return 0.8 + tea.cost();
  }

  @Override
  public String getName() {
    return tea.getName() + " , nata de coco";
  }
}
