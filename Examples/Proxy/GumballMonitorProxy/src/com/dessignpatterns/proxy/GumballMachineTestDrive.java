package com.dessignpatterns.proxy;

import com.dessignpatterns.proxy.models.GumballMachine;
import java.rmi.Naming;

public class GumballMachineTestDrive {

  public static void main(String[] args) {

    GumballMachine gumballMachine = null;
    int count;
    if (args.length < 2) {
      System.out.println("GumballMachine <name> <inventory>");
      System.exit(1);
    }

    try {
      count = Integer.parseInt(args[1]);

      gumballMachine = new GumballMachine(args[0], count);
      Naming.rebind("//localhost/" + args[0], gumballMachine);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}