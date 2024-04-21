package com.dessignpatterns.proxy;

import com.dessignpatterns.proxy.interfaces.GumballMachineRemote;
import com.dessignpatterns.proxy.models.GumballMonitor;
import java.rmi.Naming;

public class GumballMachineTestDrive {

  public static void main(String[] args) {

    String[] location = {
//        "rmi://127.0.0.1/santafe/gumballmachine",
        "rmi://127.0.0.1/boulder",
//        "rmi://127.0.0.1/seattle/gumballmachine"
    };

    GumballMonitor[] monitor = new GumballMonitor[location.length];
    for (int i = 0; i < location.length; i++) {
      try {
        GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(location[i]);
        monitor[i] = new GumballMonitor(machine);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }

    for (int i = 0; i < monitor.length; i++) {
      monitor[i].report();
    }
  }
}