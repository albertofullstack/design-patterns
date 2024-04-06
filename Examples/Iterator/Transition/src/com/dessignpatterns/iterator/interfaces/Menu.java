package com.dessignpatterns.iterator.interfaces;

import java.util.Iterator;

public interface Menu {

  Iterator createIterator();

  String getName();
}
