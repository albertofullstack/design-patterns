package com.decorator.dessignpattern;

import com.decorator.dessignpattern.models.Beverage;
import com.decorator.dessignpattern.models.DarkRoast;
import com.decorator.dessignpattern.models.Espresso;
import com.decorator.dessignpattern.models.HouseBlend;
import com.decorator.dessignpattern.models.Mocha;
import com.decorator.dessignpattern.models.Soy;
import com.decorator.dessignpattern.models.Whip;

public class Main {

  public static void main(String[] args) {
    Beverage beverage = new Espresso();
    System.out.println(beverage.getDescription() + " $" + beverage.cost());

    Beverage beverage2 = new DarkRoast();
    beverage2 = new Mocha(beverage2);
    beverage2 = new Mocha(beverage2);
    beverage2 = new Whip(beverage2);
    System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

    Beverage beverage3 = new HouseBlend();
    beverage3 = new Soy(beverage3);
    beverage3 = new Mocha(beverage3);
    beverage3 = new Whip(beverage3);
    System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
  }
}