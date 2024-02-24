package com.animalstrategy.designpatterns.models;

import com.animalstrategy.designpatterns.behaviors.BreatheBehavior;

public abstract class Animal {

  private String name;
  private int age;
  private String color;
  private BreatheBehavior breatheBehavior;

  public void setBreatheBehavior(BreatheBehavior breatheBehavior) {
    this.breatheBehavior = breatheBehavior;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void performBreathe() {
    this.breatheBehavior.breathe();
  }

  public void watch() {
    System.out.println("I am watching");
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getColor() {
    return color;
  }
}
