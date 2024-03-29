package com.designpattern.abstractfactory;

import com.designpattern.abstractfactory.interfaces.RamenRestaurant;
import com.designpattern.abstractfactory.models.HakataRamenRestaurant;
import com.designpattern.abstractfactory.models.HokkaidoRamenRestaurant;

public class Main {

  public static void main(String[] args) {

    // First instance the restaurant to order from
    RamenRestaurant hokkaidoRestaurant = new HokkaidoRamenRestaurant();
    System.out.println("Ordering from Hokkaido Restaurant");
    hokkaidoRestaurant.orderRamen("veggie");
    System.out.println("----------------------------------");
    hokkaidoRestaurant.orderRamen("pork");

    System.out.println();
    System.out.println("Ordering from Hakata Restaurant");
    RamenRestaurant hakataRestaurant = new HakataRamenRestaurant();
    hakataRestaurant.orderRamen("beef");
  }
}