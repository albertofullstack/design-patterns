package com.dessignpatterns.composite.models;

import com.dessignpatterns.composite.interfaces.MenuComponent;

public class MenuItem extends MenuComponent {

  private String name;
  private String description;

  private boolean vegetarian;

  private double price;

  public MenuItem(String name, String description, boolean vegetarian, double price) {
    this.name = name;
    this.description = description;
    this.price = price;
    this.vegetarian = vegetarian;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String getDescription() {
    return description;
  }

  @Override
  public boolean isVegetarian() {
    return vegetarian;
  }

  @Override
  public double getPrice() {
    return price;
  }

  @Override
  public void print() {
    System.out.println("  " + getName());
    if (isVegetarian()) {
      System.out.println("(v)");
    }
    System.out.println(", " + getPrice());
    System.out.println("  --" + getDescription());
  }
}
