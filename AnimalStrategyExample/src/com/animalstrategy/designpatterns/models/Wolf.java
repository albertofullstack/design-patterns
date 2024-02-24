package com.animalstrategy.designpatterns.models;

import com.animalstrategy.designpatterns.behaviors.impl.MammalBreatheBehavior;

public class Wolf extends Animal {

  public Wolf() {
    this.setBreatheBehavior(new MammalBreatheBehavior());
    this.setName("Wolf");
    this.setColor("Grey");
    this.setAge(56);
  }
}
