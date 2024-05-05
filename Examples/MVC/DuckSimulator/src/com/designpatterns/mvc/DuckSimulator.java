package com.designpatterns.mvc;

public class DuckSimulator {

  public static void main(String[] args) {

    DuckSimulator simulator = new DuckSimulator();
    AbstractDuckFactory duckFactory = new CountingDuckFactory();

    simulator.simulate(duckFactory);
  }

  void simulate(AbstractDuckFactory duckFactory) {

    Quackable redheadDuck = duckFactory.createRedheadDuck();
    Quackable duckCall = duckFactory.createDuckCall();
    Quackable rubberDuck = duckFactory.createRubberDuck();
    Quackable gooseDuck = new GooseAdapter(new Goose());

    Flock flockOfDucks = new Flock();
    flockOfDucks.add(redheadDuck);
    flockOfDucks.add(duckCall);
    flockOfDucks.add(rubberDuck);
    flockOfDucks.add(gooseDuck);

    Flock flockOfMallarDucks = new Flock();

    Quackable mallardOne = duckFactory.createMallardDuck();
    Quackable mallardTwo = duckFactory.createMallardDuck();
    Quackable mallardThree = duckFactory.createMallardDuck();
    Quackable mallardFour = duckFactory.createMallardDuck();

    flockOfMallarDucks.add(mallardOne);
    flockOfMallarDucks.add(mallardTwo);
    flockOfMallarDucks.add(mallardThree);
    flockOfMallarDucks.add(mallardFour);

    flockOfDucks.add(flockOfMallarDucks);

    System.out.println("\nDuck Simulator: With observer");
    Quackologist quackologist = new Quackologist();
    flockOfDucks.registerObserver(quackologist);

    System.out.println("\nDuck Simulator: Whole Flock Simulation");
    simulate(flockOfDucks);

    System.out.println("\nDuck simulator: Mallard Flock Simulation");
    simulate(flockOfMallarDucks);

    System.out.println("The ducks quacked " + QuackCounter.numberOfQuacks + " times");
  }

  void simulate(Quackable duck) {
    duck.quack();
  }
}