package com.dessignpattern.templatemethod;

public class Main {

  public static void main(String[] args) {

    TeaWithHook tea = new TeaWithHook();
    CoffeeWithHook coffee = new CoffeeWithHook();
    System.out.println("Making tea...");
    tea.prepareRecipe();
    System.out.println("\nMaking coffee...");
    coffee.prepareRecipe();
  }
}