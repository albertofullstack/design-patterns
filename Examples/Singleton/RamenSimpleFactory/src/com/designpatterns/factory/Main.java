package com.designpatterns.factory;

import com.designpatterns.factory.interfaces.Ramen;
import com.designpatterns.factory.models.RamenRestaurant;

public class Main {

  public static void main(String[] args) {

    RamenRestaurant hokkaidoRestaurant = new RamenRestaurant();
    hokkaidoRestaurant.orderRamen("veggie");
  }
}