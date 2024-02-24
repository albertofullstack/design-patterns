package com.animalstrategy.designpatterns.behaviors.impl;

import com.animalstrategy.designpatterns.behaviors.BreatheBehavior;

public class MammalBreatheBehavior implements BreatheBehavior {


  @Override
  public void breathe() {
    System.out.println("I breathe with my lungs!!!");
  }
}
