package com.dessignpatterns.composite.models;

import com.dessignpatterns.composite.interfaces.MenuComponent;
import java.util.Iterator;

public class Waitress {

  MenuComponent menus;

  public Waitress(MenuComponent menus) {
    this.menus = menus;
  }

  public void printMenu() {

    menus.print();
  }

  public void printBreakfastMenu() {

  }

  public void printLunchMenu() {

  }

  public void printVegetarianMenu() {

    Iterator iterator = menus.createIterator();
    System.out.println("\nVEGETARIAN MENU\n---");
    while (iterator.hasNext()) {
      MenuComponent menu = (MenuComponent) iterator.next();
      try {
        if (menu.isVegetarian()) {
          menu.print();
        }
      } catch (UnsupportedOperationException e) {}
    }
  }
}
