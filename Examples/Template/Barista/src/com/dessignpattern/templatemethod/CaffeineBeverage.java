package com.dessignpattern.templatemethod;

public abstract class CaffeineBeverage {

  void prepareRecipe() {
    boilWater();
    brew();
    pourInCup();
    addCondiments();
  }

  private void boilWater(){
    System.out.println("Boiling water");
  }

  private void pourInCup(){
    System.out.println("Pouring into cup");
  }

  public abstract void brew();

  public abstract void addCondiments();
}
