package com.dessignpatterns.iterator.models;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeMenuIterator implements Iterator {

  ArrayList<MenuItem> items;

  int index = 0;

  public PancakeMenuIterator(ArrayList items) {
    this.items = items;
  }

  @Override
  public boolean hasNext() {

    return index < items.size();
  }

  @Override
  public Object next() {

    MenuItem menuItem = items.get(index);
    index++;
    return menuItem;
  }
}
