package com.dessignpattern.example.model;

import com.dessignpattern.example.behaviors.FlyWithWings;
import com.dessignpattern.example.behaviors.Quack;

public class MallardDuck extends Duck {

  public MallardDuck() {
    quakBehavior = new Quack();
    flyBehavior = new FlyWithWings();
  }

  public void display() {
    System.out.println("I'm a real Mallard duck!");
  }
}
