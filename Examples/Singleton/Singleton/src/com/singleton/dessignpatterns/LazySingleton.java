package com.singleton.dessignpatterns;

public class LazySingleton {

  private static LazySingleton singleton;
  private LazySingleton() {}

  // Lazy mode
  public static LazySingleton getInstance() {

    if (singleton == null) {
      singleton = new LazySingleton();
    }
    return singleton;
  }
}
