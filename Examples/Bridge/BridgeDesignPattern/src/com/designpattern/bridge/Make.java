package com.designpattern.bridge;

public class Make implements Workshop {

  @Override
  public void make() {
    System.out.println("Making...");
  }
}
