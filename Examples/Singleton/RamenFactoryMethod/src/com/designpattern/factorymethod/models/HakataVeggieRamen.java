package com.designpattern.factorymethod.models;

import java.util.Arrays;
import java.util.Collections;

public class HakataVeggieRamen extends Ramen {

  public HakataVeggieRamen() {
    name = "Hakata Veggie ramen";
    price = 0.1;
    noodles = "Thin noodles";
    toppings = Arrays.asList("Green onions", "Extra tofu");
  }
}
