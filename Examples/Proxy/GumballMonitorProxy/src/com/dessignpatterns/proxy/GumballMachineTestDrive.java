package com.dessignpatterns.proxy;

import com.dessignpatterns.proxy.models.GumballMachine;
import com.dessignpatterns.proxy.models.GumballMonitor;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class GumballMachineTestDrive {
    public static void main(String[] args) throws RemoteException {

        GumballMachine gumballMachine = null;
        int count;
        if (args.length < 2) {
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }

        try {
            count = Integer.parseInt(args[1]);
            gumballMachine = new GumballMachine(args[0], count);
            Naming.rebind("//" + args[0] + "/gumballmachine", gumballMachine);
        } catch (Exception e) {
            e.printStackTrace();
        }

        GumballMonitor gumballMonitor = new GumballMonitor(gumballMachine);
        gumballMonitor.report();
    }
}