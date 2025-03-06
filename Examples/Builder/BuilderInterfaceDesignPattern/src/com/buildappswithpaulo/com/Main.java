package com.buildappswithpaulo.com;

import com.buildappswithpaulo.com.Person.Builder;

public class Main {

  public static void main(String[] args) {

    Person person = new Builder("Antonio", "Camacho")
        .address("C/ Falsa")
        .phone("66565656")
        .build();
    System.out.println(person);
  }
}