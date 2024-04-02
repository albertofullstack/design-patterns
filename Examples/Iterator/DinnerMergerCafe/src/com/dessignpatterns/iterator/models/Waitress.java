package com.dessignpatterns.iterator.models;

import com.dessignpatterns.iterator.interfaces.Menu;
import java.util.Iterator;

public class Waitress {

  private Menu pancakeMenu;
  private Menu dinerMenu;
  private Menu cafeMenu;

  public Waitress(Menu pancakeMenu, Menu dinerMenu, Menu cafeMenu) {
    this.pancakeMenu = pancakeMenu;
    this.dinerMenu = dinerMenu;
    this.cafeMenu = cafeMenu;
  }

  public void printMenu() {

    System.out.println("MENU\n-------");
    System.out.println("BREAKFAST");
    printIterator(pancakeMenu.createIterator());

    System.out.println();
    System.out.println("LUNCH");
    printIterator(dinerMenu.createIterator());

    System.out.println();
    System.out.println("DINNER");
    printIterator(cafeMenu.createIterator());
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
