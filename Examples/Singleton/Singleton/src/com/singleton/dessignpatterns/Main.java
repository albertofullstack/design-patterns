package com.singleton.dessignpatterns;

public class Main {

  public static void main(String[] args) {
    // The two singleton instances have the same memory address (since only one is declared)
    LazySingleton singleton = LazySingleton.getInstance();
    System.out.println(singleton);

    LazySingleton singleton2 = LazySingleton.getInstance();
    System.out.println(singleton2);
  }
}