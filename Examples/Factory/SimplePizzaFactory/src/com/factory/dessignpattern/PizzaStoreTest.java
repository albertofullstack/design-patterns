package com.factory.dessignpattern;

import com.factory.dessignpattern.model.PizzaStore;
import com.factory.dessignpattern.model.SimplePizzaFactory;

public class PizzaStoreTest {

  public static void main(String[] args) {

    PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
    pizzaStore.orderPizza("veggie");
    pizzaStore.orderPizza("pepperoni");
  }
}