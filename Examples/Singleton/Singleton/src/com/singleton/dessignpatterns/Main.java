package com.singleton.dessignpatterns;

public class Main {

  public static void main(String[] args) {
    // The two singleton instances have the same memory address (since only one is declared)

    // Eager mode creates an instance of the class as soon as the application is initialized
    System.out.println("Eager demo starts here");
    System.out.println(EagerSingleton.dummyEagerProperty());
    EagerSingleton eagerSingleton = EagerSingleton.getInstance();
    System.out.println(eagerSingleton);

    EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();
    System.out.println(eagerSingleton2);

    System.out.println();

    // Lazy mode creates an instance of the class only when is needed
    System.out.println("Lazy demo starts here");
    System.out.println(LazySingleton.dummyLazyProperty());
    LazySingleton lazySingleton = LazySingleton.getInstance();
    System.out.println(lazySingleton);

    LazySingleton lazySingleton2 = LazySingleton.getInstance();
    System.out.println(lazySingleton2);
  }
}