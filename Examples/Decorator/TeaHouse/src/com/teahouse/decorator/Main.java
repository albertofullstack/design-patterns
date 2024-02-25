package com.teahouse.decorator;

import com.teahouse.decorator.decorators.Milk;
import com.teahouse.decorator.decorators.SagoPearls;
import com.teahouse.decorator.models.GreenTea;
import com.teahouse.decorator.models.Tea;

public class Main {

  public static void main(String[] args) {

    Tea greenTea = new GreenTea();
    Milk milk = new Milk(greenTea);
    SagoPearls pearls = new SagoPearls(milk);
    System.out.println("Order: " + pearls.getName() + " cost: " + pearls.cost());
  }
}