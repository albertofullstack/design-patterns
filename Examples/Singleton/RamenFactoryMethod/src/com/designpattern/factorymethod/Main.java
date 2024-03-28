package com.designpattern.factorymethod;

import com.designpattern.factorymethod.interfaces.RamenRestaurant;
import com.designpattern.factorymethod.models.HakataRamenRestaurant;
import com.designpattern.factorymethod.models.HokkaidoRamenRestaurant;

public class Main {

  public static void main(String[] args) {

    // First instance the restaurant to order from
    RamenRestaurant hokkaidoRestaurant = new HokkaidoRamenRestaurant();
    System.out.println("Ordering from Hokkaido Restaurant");
    hokkaidoRestaurant.orderRamen("veggie");
    hokkaidoRestaurant.orderRamen("pork");

    System.out.println();
    System.out.println("Ordering from Hakata Restaurant");
    RamenRestaurant hakataRestaurant = new HakataRamenRestaurant();
    hakataRestaurant.orderRamen("beef");
  }
}