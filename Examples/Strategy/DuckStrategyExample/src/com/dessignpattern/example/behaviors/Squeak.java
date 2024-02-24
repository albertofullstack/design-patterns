package com.dessignpattern.example.behaviors;

public class Squeak implements QuakBehavior {

  @Override
  public void quack() {
    System.out.println("Squeak");
  }
}
