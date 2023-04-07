package com.dessignpattern.example.model;

import com.dessignpattern.example.behaviors.FlyNoWay;
import com.dessignpattern.example.behaviors.Quack;

public class ModelDuck extends Duck {

  public ModelDuck() {
    flyBehavior = new FlyNoWay();
    quakBehavior = new Quack();
  }

  @Override
  public void display() {
    System.out.println("I'm a model duck");
  }
}
