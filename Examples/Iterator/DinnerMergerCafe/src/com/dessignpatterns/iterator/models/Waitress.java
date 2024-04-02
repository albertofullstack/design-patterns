package com.dessignpatterns.iterator.models;

import com.dessignpatterns.iterator.interfaces.Menu;
import java.util.Collections;
import java.util.Iterator;

public class Waitress {

  private Menu pancakeMenu;
  private Menu dinerMenu;

  public Waitress(Menu pancakeMenu, Menu dinerMenu) {
    this.pancakeMenu = pancakeMenu;
    this.dinerMenu = dinerMenu;
  }

  public void printMenu() {

    System.out.println("Pancake menu");
    printIterator(pancakeMenu.createIterator());

    System.out.println();
    System.out.println("Dinner menu");
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
