package com.dessignpattern.example.behaviors;

public class Quack implements QuakBehavior {

  @Override
  public void quack() {
    System.out.println("Quack");
  }
}
