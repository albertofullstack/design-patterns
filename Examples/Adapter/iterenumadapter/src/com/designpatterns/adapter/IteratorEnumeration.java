package com.designpatterns.adapter;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorEnumeration implements Enumeration {

  private Iterator iterator;

  public IteratorEnumeration(Iterator iterator) {
    this.iterator = iterator;
  }

  @Override
  public boolean hasMoreElements() {
    return this.iterator.hasNext();
  }

  @Override
  public Object nextElement() {
    return this.iterator.next();
  }
}
