package com.decorator.dessignpattern.models;

public abstract class Beverage {

  private String description;

  public String getDescription() {
    return "This is a regular beverage";
  }

  public abstract double cost();
}
