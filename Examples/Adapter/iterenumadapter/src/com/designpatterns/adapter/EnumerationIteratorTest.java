package com.designpatterns.adapter;

import java.util.Vector;

public class EnumerationIteratorTest {

  public static void main(String[] args) {

    Vector<String> vector=new Vector<>(20, 5);
    vector.add("red");
    vector.add("green");
    vector.add("pink");
    vector.add("brown");

    EnumerationIterator enumerationIterator = new EnumerationIterator(vector.elements());
    while (enumerationIterator.hasNext()) {
      System.out.println(enumerationIterator.next());
    }
  }
}