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

  }

  public boolean isItemVegetarian(String name) {

    return false;
  }
}
