package com.singleton.dessignpatterns;

public class EagerSingleton {

  private static EagerSingleton eagerSingleton = new EagerSingleton();

  private EagerSingleton() {}

  public static EagerSingleton getInstance() {
    return eagerSingleton;
  }
}
