package com.dessignpatterns.iterator.models;

import com.dessignpatterns.iterator.interfaces.Menu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Waitress {

  List<Menu> menus;

  public Waitress(List<Menu> menus) {
    this.menus = menus;
  }

  public void printMenu() {

    Iterator menuIterator = menus.iterator();
    while(menuIterator.hasNext()) {
      Menu menu = (Menu) menuIterator.next();
      System.out.println(menu.getName());
      printMenu(menu.createIterator());
      System.out.println();
    }
  }

  private void printMenu(Iterator iterator) {

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
