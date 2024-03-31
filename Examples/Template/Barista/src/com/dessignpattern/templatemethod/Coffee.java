package com.dessignpattern.templatemethod;

public class Coffee extends CaffeineBeverageWithHook {

  @Override
  public void brew() {
    System.out.println("Dripping coffee through filter");
  }

  @Override
  public void addCondiments() {
    System.out.println("Adding sugar and milk");
  }
}
