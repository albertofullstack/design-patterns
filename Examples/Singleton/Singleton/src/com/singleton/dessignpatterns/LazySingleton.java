package com.singleton.dessignpatterns;

public class LazySingleton {

  private static LazySingleton singleton;
  private LazySingleton() {
    System.out.println("Lazy Instance Created");
  }

  // Lazy mode
  public static LazySingleton getInstance() {

    if (singleton == null) {
      singleton = new LazySingleton();
    }
    return singleton;
  }

  public static String dummyLazyProperty() {
    return "This is a Dummy Lazy Property";
  }
}
