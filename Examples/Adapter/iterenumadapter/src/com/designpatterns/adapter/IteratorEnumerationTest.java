package com.designpatterns.adapter;

import java.util.ArrayList;
import java.util.List;

public class IteratorEnumerationTest {

  public static void main(String[] args) {

    List<String> colors = new ArrayList<>();
    colors.add("red");
    colors.add("green");
    colors.add("pink");
    colors.add("brown");

    IteratorEnumeration iteratorEnumeration = new IteratorEnumeration(colors.iterator());
    while (iteratorEnumeration.hasMoreElements()) {
      System.out.println(iteratorEnumeration.nextElement());
    }
  }
}