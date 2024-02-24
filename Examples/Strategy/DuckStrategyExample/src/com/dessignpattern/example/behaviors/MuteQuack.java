package com.dessignpattern.example.behaviors;

public class MuteQuack implements QuakBehavior {

  @Override
  public void quack() {
    System.out.println("<< Silence >>");
  }
}
