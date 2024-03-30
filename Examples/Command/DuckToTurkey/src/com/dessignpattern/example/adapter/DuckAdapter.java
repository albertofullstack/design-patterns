package com.dessignpattern.example.adapter;

import com.dessignpattern.example.model.Duck;
import com.dessignpattern.example.model.Turkey;

public class DuckAdapter implements Turkey {

  private Duck duck;

  public DuckAdapter(Duck duck) {
    this.duck = duck;
  }

  @Override
  public void gobble() {
    duck.quack();
  }

  @Override
  public void fly() {
    duck.fly();
  }
}
