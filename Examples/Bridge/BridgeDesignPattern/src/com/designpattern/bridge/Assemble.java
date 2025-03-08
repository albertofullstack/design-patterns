package com.designpattern.bridge;

public class Assemble implements Workshop {

  @Override
  public void make() {
    System.out.println("...also");
    System.out.println("Assembled");
  }
}
