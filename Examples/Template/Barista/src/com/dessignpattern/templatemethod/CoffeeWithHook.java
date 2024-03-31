package com.dessignpattern.templatemethod;

public class CoffeeWithHook extends CaffeineBeverageWithHook {

  @Override
  public void brew() {
    System.out.println("Dripping coffee through filter");
  }

  @Override
  public void addCondiments() {
    System.out.println("Adding sugar and milk");
  }

  @Override
  public boolean customerWantsCondiments() {

  }
}
