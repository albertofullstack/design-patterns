package com.singleton.dessignpatterns;

public class Main {

  public static void main(String[] args) {
    // The two singleton instances have the same memory address (since only one is declared)
    System.out.println("I am a lazy singleton");
    LazySingleton lazySingleton = LazySingleton.getInstance();
    System.out.println(lazySingleton);

    LazySingleton lazySingleton2 = LazySingleton.getInstance();
    System.out.println(lazySingleton2);

    System.out.println();

    System.out.println("I am an eager singleton");
    EagerSingleton eagerSingleton = EagerSingleton.getInstance();
    System.out.println(eagerSingleton);

    EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();
    System.out.println(eagerSingleton2);

  }
}