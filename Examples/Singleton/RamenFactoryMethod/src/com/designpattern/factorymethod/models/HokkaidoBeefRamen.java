package com.designpattern.factorymethod.models;

import java.util.Arrays;

public class HokkaidoBeefRamen extends Ramen {

  public HokkaidoBeefRamen() {
    name = "Hokkaido Beef ramen";
    price = 3.2;
    noodles = "Thick noodles";
    toppings = Arrays.asList("Creamy butter", "Sweet corn");
  }
}
