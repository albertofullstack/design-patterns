package com.singleton.dessignpatterns;

public class EagerSingleton {

  private static EagerSingleton eagerSingleton = new EagerSingleton();

  private EagerSingleton() {}

  public EagerSingleton getInstance() {
    return eagerSingleton;
  }
}
