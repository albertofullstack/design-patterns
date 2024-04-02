package com.dessignpatterns.iterator.models;

import com.dessignpatterns.iterator.interfaces.Iterator;

public class DinnerMenuIterator implements Iterator {

  MenuItem[] items;

  int position = 0;

  public DinnerMenuIterator(MenuItem[] items) {
    this.items = items;
  }

  @Override
  public boolean hasNextElement() {

    return position < items.length && items[position] != null;
  }

  @Override
  public Object next() {

    MenuItem menuItem = items[position];
    position++;
    return menuItem;
  }
}
