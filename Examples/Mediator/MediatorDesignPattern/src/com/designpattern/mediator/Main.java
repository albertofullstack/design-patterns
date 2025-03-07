package com.designpattern.mediator;

public class Main {

  public static void main(String[] args) {

    ATCMediator mediator = new ATCMediatorImpl();

    // Create a few aircrafts
    AirCraft boeing1 = new AirCraftImpl(mediator, "boeing1");
    AirCraft boeing2 = new AirCraftImpl(mediator, "boeing2");
    AirCraft condor3 = new AirCraftImpl(mediator, "condor3");
    AirCraft helicopter1 = new AirCraftImpl(mediator, "helicopter1");

    mediator.addAirCraft(boeing1);
    mediator.addAirCraft(boeing2);
    mediator.addAirCraft(condor3);
    mediator.addAirCraft(helicopter1);

    boeing1.send("Hello from Boeing 1");
  }
}