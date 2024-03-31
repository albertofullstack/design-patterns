package com.dessignpattern.templatemethod;

public class Coffee {

  void prepareRecipe() {
    boilWater();
    brewCoffeeGrinds();
    pourInCup();
    addSugarAndMilk();
  }

  private void boilWater(){
    System.out.println("Boiling water");
  }

  private void brewCoffeeGrinds(){
    System.out.println("Dripping com.dessignpattern.templatemethod.Coffee through filter");
  }

  private void pourInCup(){
    System.out.println("Pouring into cup");
  }

  private void addSugarAndMilk(){
    System.out.println("Adding sugar and milk");
  }
}
