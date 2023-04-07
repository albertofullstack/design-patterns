package com.dessignpattern.example;

import com.dessignpattern.example.model.Duck;
import com.dessignpattern.example.model.MallardDuck;

public class MiniDuckSimulator {

  public static void main(String[] args) {
    Duck mallard = new MallardDuck();
    mallard.performQuack();
    mallard.performFly();
  }
}