package com.teahouse.decorator;

import com.teahouse.decorator.decorators.Milk;
import com.teahouse.decorator.decorators.SagoPearls;
import com.teahouse.decorator.models.GreenTea;
import com.teahouse.decorator.models.Tea;

public class Main {

  public static void main(String[] args) {

    Tea greenTea = new GreenTea();
    greenTea = new Milk(greenTea);
    greenTea = new SagoPearls(greenTea);
    System.out.println("Order: " + greenTea.getName() + " cost: " + greenTea.cost());
  }
}