package com.dessignpattern.templatemethod;

public class Main {

  public static void main(String[] args) {

    Tea tea = new Tea();
    Coffee coffee = new Coffee();
    System.out.println("Making tea...");
    tea.prepareRecipe();
    System.out.println("Making coffee...");
    coffee.prepareRecipe();
  }
}