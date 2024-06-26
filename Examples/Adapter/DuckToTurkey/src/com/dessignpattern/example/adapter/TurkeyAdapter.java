package com.dessignpattern.example.adapter;

import com.dessignpattern.example.model.Duck;
import com.dessignpattern.example.model.Turkey;
import java.util.stream.IntStream;

public class TurkeyAdapter implements Duck {

  private Turkey turkey;

  public TurkeyAdapter(Turkey turkey) {
    this.turkey = turkey;
  }

  @Override
  public void quack() {
    turkey.gobble();
  }

  @Override
  public void fly() {
    IntStream.range(0, 5).forEach(index -> turkey.fly());
  }
}
