package com.dessignpatterns.iterator.models;

import com.dessignpatterns.iterator.interfaces.Iterator;
import java.util.ArrayList;

public class PancakeMenuIterator implements Iterator {

  ArrayList<MenuItem> items;

  int index = 0;

  public PancakeMenuIterator(ArrayList items) {
    this.items = items;
  }

  @Override
  public boolean hasNextElement() {

    return index < items.size();
  }

  @Override
  public Object next() {

    MenuItem menuItem = items.get(index);
    index++;
    return menuItem;
  }
}
