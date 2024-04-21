package com.dessignpatterns.proxy.models;

import com.dessignpatterns.proxy.interfaces.GumballMachineRemote;
import java.rmi.RemoteException;

public class GumballMonitor {

  GumballMachineRemote machine;

  public GumballMonitor(GumballMachineRemote gumballMachine) {
    this.machine = gumballMachine;
  }

  public void report() {
    try {
      System.out.println("Gumball Machine: " + machine.getLocation());
      System.out.println("Current inventory: " + machine.getCount() + " gumballs");
      System.out.println("Current state: " + machine.getState());
    } catch (RemoteException e) {
      e.printStackTrace();
    }
  }
}
