package com.dessignpattern.templatemethod;

public class Tea extends CaffeineBeverageWithHook {

  @Override
  public void brew() {
    System.out.println("Steeping the tea");
  }

  @Override
  public void addCondiments() {
    System.out.println("Adding lemon");
  }
}
