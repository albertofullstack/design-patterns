package com.designpatterns.factory;

import com.designpatterns.factory.models.RamenFactory;
import com.designpatterns.factory.models.RamenRestaurant;

public class Main {

  public static void main(String[] args) {

    RamenRestaurant hokkaidoRestaurant = new RamenRestaurant(new RamenFactory());
    hokkaidoRestaurant.orderRamen("veggie");
  }
}