package com.singleton.dessignpatterns;

public class Main {

  public static void main(String[] args) {
    // The two singleton instances have the same memory address (since only one is declared)
    Singleton singleton = Singleton.getInstance();
    System.out.println(singleton);

    Singleton singleton2 = Singleton.getInstance();
    System.out.println(singleton2);
  }
}