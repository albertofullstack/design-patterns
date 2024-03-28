package com.designpattern.factorymethod.models;

import java.util.Arrays;

public class HokkaidoVeggieRamen extends Ramen {

  public HokkaidoVeggieRamen() {
    name = "Hokkaido Veggie ramen";
    price = 2.3;
    noodles = "Medium noodles";
    toppings = Arrays.asList("Creamy butter", "Sweet corn");
  }
}
