package com.designpattern.bridge;

public class Bike extends Vehicle {

  public Bike(Workshop workshop, Workshop workshop2) {
    super(workshop, workshop2);
  }

  @Override
  public void manufacture() {
    System.out.println("Bike...");
    workshop.make();
    workshop.make();
  }
}
