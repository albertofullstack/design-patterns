package com.singleton.dessignpatterns;

public class EagerSingleton {

  private static EagerSingleton eagerSingleton = new EagerSingleton();

  private EagerSingleton() {
    System.out.println("Eager Instance Created");
  }

  public static EagerSingleton getInstance() {
    return eagerSingleton;
  }

  public static String dummyEagerProperty() {
    return "This is a Dummy Eager Property";
  }
}
