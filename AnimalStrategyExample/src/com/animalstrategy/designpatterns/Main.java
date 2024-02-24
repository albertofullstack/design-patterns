package com.animalstrategy.designpatterns;

import com.animalstrategy.designpatterns.models.Animal;
import com.animalstrategy.designpatterns.models.Fish;
import com.animalstrategy.designpatterns.models.Wolf;

public class Main {

  public static void main(String[] args) {
    Animal fish = new Fish();
    fish.performBreathe();

    Animal wolf = new Wolf();
    wolf.performBreathe();
  }
}