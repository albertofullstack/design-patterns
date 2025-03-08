package com.designpattern.bridge;

public class Car extends Vehicle {

  public Car(Workshop workshop, Workshop workshop2) {
    super(workshop, workshop2);
  }

  @Override
  public void manufacture() {
    System.out.println("Car...");
    workshop.make();
    workshop2.make();
  }
}
