package com.dessignpattern.templatemethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TeaWithHook extends CaffeineBeverageWithHook {

  @Override
  public void brew() {
    System.out.println("Steeping the tea");
  }

  @Override
  public void addCondiments() {
    System.out.println("Adding lemon");
  }

  @Override
  public boolean customerWantsCondiments() {
    String answer = getUserInput();
    return answer.toLowerCase().startsWith("y");
  }

  private String getUserInput() {

    String answer = null;

    System.out.println("Would you like lemon with your tea (y/n)? ");

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    try {
      answer = in.readLine();
    } catch (IOException e) {
      System.out.println("IO Error trying to read your answer");
    }
    if (answer == null) {
      return "no";
    }
    return answer;
  }
}
