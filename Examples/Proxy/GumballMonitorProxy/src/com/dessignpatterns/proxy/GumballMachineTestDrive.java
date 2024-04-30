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
      System.setProperty("java.rmi.server.hostname", "127.0.0.1");

      count = Integer.parseInt(args[1]);

      gumballMachine = new GumballMachine(args[0], count);

      System.out.println("Trying to bind");
      Naming.rebind(String.format("%s%s%s", "//localhost/", args[0], "/gumballmachine"),
          gumballMachine);
      System.out.println("Bound");

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}