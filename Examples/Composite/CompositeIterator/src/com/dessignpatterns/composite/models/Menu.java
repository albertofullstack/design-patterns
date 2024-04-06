package com.dessignpatterns.composite.models;

import com.dessignpatterns.composite.interfaces.MenuComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu extends MenuComponent {

  private String name;
  private String description;
  List<MenuComponent> menus;

  public Menu(String name, String description) {
    this.name = name;
    this.description = description;
    this.menus = new ArrayList<>();
  }

  @Override
  public void add(MenuComponent item) {
    this.menus.add(item);
  }

  @Override
  public void remove(MenuComponent item) {
    this.menus.remove(item);
  }

  @Override
  public MenuComponent getChild(int index) {
    return menus.get(index);
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String getDescription() {
    return description;
  }

  @Override
  public void print() {
    System.out.println("\n" + getName());
    System.out.println("\n" + getDescription());
    for (MenuComponent menuItem : menus) {
      menuItem.print();
    }
  }

  @Override
  public Iterator createIterator() {
    return new CompositeIterator(menus.iterator());
  }
}
