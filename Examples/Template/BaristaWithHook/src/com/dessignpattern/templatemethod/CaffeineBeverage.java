package com.dessignpattern.templatemethod;

public abstract class CaffeineBeverage {

  void prepareRecipe() {
    boilWater();
    brew();
    pourInCup();

    if (customerWantsCondiments()) {
      addCondiments();
    }
  }

  final void boilWater() {
    System.out.println("Boiling water");
  }

  final void pourInCup() {
    System.out.println("Pouring into cup");
  }

  public abstract void brew();

  public abstract void addCondiments();

  boolean customerWantsCondiments() {
    return true;
  }
}
