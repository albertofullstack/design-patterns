package com.designpattern.factorymethod.models;

import java.util.Collections;

public class HakataBeefRamen extends Ramen {

  public HakataBeefRamen() {
    name = "Hakata Beef ramen";
    price = 10.99;
    noodles = "Thin noodles";
    toppings = Collections.singletonList("Green onions");
  }
}
