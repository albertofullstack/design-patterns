package com.dessignpattern.example.model;

import com.dessignpattern.example.behaviors.FlyBehavior;
import com.dessignpattern.example.behaviors.QuakBehavior;

public abstract class Duck {

  FlyBehavior flyBehavior;
  QuakBehavior quakBehavior;

  public Duck() {
  }

  public void performQuack() {
    quakBehavior.quack();
  }

  public void performFly() {
    flyBehavior.fly();
  }

  public abstract void display();

  public void swim() {
    System.out.println("All ducks float, even decoys!");
  }

  public void setFlyBehavior(FlyBehavior flyBehavior) {
    this.flyBehavior = flyBehavior;
  }

  public void setQuakBehavior(QuakBehavior quakBehavior) {
    this.quakBehavior = quakBehavior;
  }
}
