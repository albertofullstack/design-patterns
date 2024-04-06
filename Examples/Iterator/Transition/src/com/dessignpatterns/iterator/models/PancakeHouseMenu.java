package com.dessignpatterns.iterator.models;

import com.dessignpatterns.iterator.interfaces.Menu;
import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {

  ArrayList menuItems;

  private String name;

  public PancakeHouseMenu() {

    this.name = "BREAKFAST MENU";

    menuItems = new ArrayList();

    addItem("K&B's Pancake Breakfast",
        "Pancakes with scrambled eggs, and toast",
        true,
        2.99);

    addItem("Regular Pancake Breakfast",
        "Pancakes with fried eggs, sausage",
        false,
        2.99);

    addItem("Blueberry Pancakes",
        "Pancakes made with fresh blueberries",
        true,
        3.49);

    addItem("Waffles",
        "Waffles, with your choice of blueberries or strawberries",
        true,
        3.59);
  }

  public void addItem(String name, String description,
      boolean vegetarian, double price)
  {
    MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
    menuItems.add(menuItem);
  }

  public Iterator createIterator() {
    return menuItems.iterator();
  }

  public String toString() {
    return "Objectville Pancake House Menu";
  }

  // other menu methods here
  @Override
  public String getName() {
    return name;
  }
}