package com.dessignpattern.example;

import com.dessignpattern.example.adapter.TurkeyAdapter;
import com.dessignpattern.example.model.Duck;
import com.dessignpattern.example.model.MallardDuck;
import com.dessignpattern.example.model.Turkey;
import com.dessignpattern.example.model.WildTurkey;

public class DuckTestDrive {

  public static void main(String[] args) {

    System.out.println("I am a duck");
    Duck duck = new MallardDuck();
    duck.fly();
    duck.quack();

    System.out.println();
    System.out.println("I am a turkey");
    Turkey turkey = new WildTurkey();
    turkey.fly();
    turkey.gobble();

    System.out.println();
    System.out.println("I am a turkey disguised as a duck");
    Duck turkeyAdapter = new TurkeyAdapter(turkey);
    turkeyAdapter.fly();
    turkeyAdapter.quack();
  }
}