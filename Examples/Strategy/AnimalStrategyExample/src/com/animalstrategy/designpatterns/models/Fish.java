package com.animalstrategy.designpatterns.models;

import com.animalstrategy.designpatterns.behaviors.impl.WaterBreatheBehavior;

public class Fish extends Animal {

  private String numberOfScales;

  public Fish() {
    this.numberOfScales = "500";
    this.setAge(500);
    this.setColor("Silver");
    this.setBreatheBehavior(new WaterBreatheBehavior());
  }
}
