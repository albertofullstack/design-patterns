package com.dessignpattern.templatemethod;

public abstract class CaffeineBeverageWithHook {

  void prepareRecipe() {
    boilWater();
    brew();
    pourInCup();
    addCondiments();
  }

  final void boilWater(){
    System.out.println("Boiling water");
  }

  final void pourInCup(){
    System.out.println("Pouring into cup");
  }

  public abstract void brew();

  public abstract void addCondiments();
}
