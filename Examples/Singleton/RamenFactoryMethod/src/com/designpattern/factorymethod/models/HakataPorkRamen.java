package com.designpattern.factorymethod.models;

import java.util.Collections;

public class HakataPorkRamen extends Ramen {

  public HakataPorkRamen() {
    name = "Hakata Pork ramen";
    price = 2.3;
    noodles = "Thin noodles";
    toppings = Collections.singletonList("Green onions");
  }
}
