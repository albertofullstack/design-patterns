package com.dessignpattern.example;

import com.dessignpattern.example.behaviors.FlyRocketPowered;
import com.dessignpattern.example.model.Duck;
import com.dessignpattern.example.model.MallardDuck;
import com.dessignpattern.example.model.ModelDuck;

public class MiniDuckSimulator {

  public static void main(String[] args) {
    Duck mallard = new MallardDuck();
    mallard.performQuack();
    mallard.performFly();

    Duck model = new ModelDuck();
    model.performFly();
    model.setFlyBehavior(new FlyRocketPowered());
    model.performFly();
  }
}