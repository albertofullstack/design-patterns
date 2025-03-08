package com.designpatterns.cof;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    CEOPurchasePower ceoPurchasePower = new CEOPurchasePower();
    DirectorPurchasePower directorPurchasePower = new DirectorPurchasePower();
    ManagerPurchasePower managerPurchasePower = new ManagerPurchasePower();

    ceoPurchasePower.setSuccesor(directorPurchasePower);
    directorPurchasePower.setSuccesor(ceoPurchasePower);
    managerPurchasePower.setSuccesor(directorPurchasePower);

    while (true) {
      System.out.println("Enter the amount to check who should approve your budget");
      System.out.println(">>");
      try {
        double d = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
        managerPurchasePower.processRequest(new PurchaseRequest(d, "Buy Stuff"));
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}