package com.dessignpatterns.iterator.models;

import java.util.Collections;
import java.util.Iterator;

public class Waitress {

  public void printMenu() {

    System.out.println("Pancake menu");
    PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
    printIterator(pancakeHouseMenu.createIterator());

    System.out.println();
    System.out.println("Dinner menu");
    DinerMenu dinerMenu = new DinerMenu();
    printIterator(dinerMenu.createIterator());
  }

  private void printIterator(Iterator iterator) {

    while (iterator.hasNext()) {
      MenuItem item = (MenuItem) iterator.next();
      System.out.print(item.getName() + ", ");
      System.out.print(item.getPrice() + " -- ");
      System.out.println(item.getDescription());
    }
  }

  public void printBreakfastMenu() {

  }

  public void printLunchMenu() {

  }

  public void printVegetarianMenu() {

  }

  public boolean isItemVegetarian(String name) {

    return false;
  }
}
