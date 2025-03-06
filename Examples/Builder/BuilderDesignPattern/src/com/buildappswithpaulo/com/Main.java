package com.buildappswithpaulo.com;

public class Main {

  public static void main(String[] args) {

    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Hello world")
        .append(" I don't know ")
        .append(3);
    System.out.println(stringBuilder);

    User user = new User.UserBuilder("James", "Bond")
        .address("Argentina")
        .age(56)
        .build();
    System.out.println(user);
  }
}