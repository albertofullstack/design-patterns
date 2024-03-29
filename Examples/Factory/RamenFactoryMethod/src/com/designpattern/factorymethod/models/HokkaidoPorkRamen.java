package com.designpattern.factorymethod.models;

import java.util.Arrays;

public class HokkaidoPorkRamen extends Ramen {

  public HokkaidoPorkRamen() {
    name = "Hokkaido Pork ramen";
    price = 4.8;
    noodles = "Thick noodles";
    toppings = Arrays.asList("Creamy butter", "Sweet corn");
  }
}
