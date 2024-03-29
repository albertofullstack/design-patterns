package com.designpatterns.factory.interfaces;

public abstract class Ramen {

  private String name;

  private double price;

  private String type;

  public Ramen(String name) {
    this.name = name;
  }

  public void prepare() {
    System.out.println("Preparing " + name);
  }

  public void serve() {
    System.out.println("Serving " + name);
  }

  public abstract double calculateCost();
}
