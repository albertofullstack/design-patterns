package com.singleton.dessignpatterns;

public class Singleton {

  private static Singleton singleton;
  private Singleton () {}

  // Lazy mode
  public static Singleton getInstance() {

    if (singleton == null) {
      singleton = new Singleton();
    }
    return singleton;
  }
}
