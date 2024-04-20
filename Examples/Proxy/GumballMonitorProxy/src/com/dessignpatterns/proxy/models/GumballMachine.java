package com.dessignpatterns.proxy.models;


import com.dessignpatterns.proxy.interfaces.State;

public class GumballMachine {

  State soldOutState;
  State noQuarterState;
  State hasQuarterState;
  State soldState;
  State winnerState;

  String location;

  State state = new SoldOutState(this);
  int count = 0;

  public GumballMachine(String location, int count) {
    soldOutState = new SoldOutState(this);
    noQuarterState = new NoQuarterState(this);
    hasQuarterState = new HasQuarterState(this);
    soldState = new SoldState(this);
    winnerState = new WinnerState(this);
    this.location = location;

    this.count = count;
    if (count > 0) {
      this.state = new NoQuarterState(this);
    }
  }

  public void insertQuarter() {

    state.insertQuarter();
  }

  public void ejectQuarter() {

    state.ejectQuarter();
  }

  public void turnCrank() {

    state.turnCrank();
    state.dispense();
  }

  void releaseBall() {
    System.out.println("A gumball comes rolling out the slot...");
    if (count != 0) {
      count--;
    }
  }

  public String toString() {
    StringBuffer result = new StringBuffer();
    result.append("\nMighty Gumball, Inc.");
    result.append("\nJava-enabled Standing Gumball Model #2004\n");
    result.append("Inventory: " + count + " gumball");
    if (count != 1) {
      result.append("s");
    }
    result.append("\nMachine is " + state.toString());
    result.append("\n");
    return result.toString();
  }

  public void setState(State state) {
    this.state = state;
  }

  public State getSoldOutState() {
    return soldOutState;
  }

  public State getNoQuarterState() {
    return noQuarterState;
  }

  public State getHasQuarterState() {
    return hasQuarterState;
  }

  public State getSoldState() {
    return soldState;
  }

  public State getWinnerState() {
    return winnerState;
  }

  public int getCount() {
    return count;
  }

  public String getLocation() {
    return location;
  }

  public State getState() {
    return state;
  }
}
