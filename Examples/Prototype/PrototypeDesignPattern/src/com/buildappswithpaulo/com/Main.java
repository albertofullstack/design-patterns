package com.buildappswithpaulo.com;

import model.Person;

public class Main {

  public static void main(String[] args) {

    Person person = new Person("James", 45);
    System.out.println("Person 1: " + person);

    Person personClone = (Person) person.clone();
    System.out.println("Person copy: " + personClone);

    System.out.println(System.identityHashCode(person) + "\n"
      + System.identityHashCode(personClone));

//    Person person = new Person("Bonnie", 35);
//    System.out.println("Person 1: " + person);
//
//    Person personClone = (Person) person.clone();
//    personClone.setName("Nina");
//    System.out.println("Person 1 clone: " + personClone);
//
//    Dolphin flipper = new Dolphin("Flipper", 54);
//    System.out.println("Dolphin Flipper: " + flipper);
//
//    Dolphin flipperClone = (Dolphin) flipper.clone();
//    System.out.println("Flipper clone: " + flipperClone);


  }
}