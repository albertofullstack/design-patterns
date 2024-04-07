package com.dessignpatterns.state.models;

import com.dessignpatterns.state.GumballMachine;
import com.dessignpatterns.state.interfaces.State;

public class SoldState implements State {

  private GumballMachine gumballMachine;

  public SoldState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public void insertQuarter() {

  }

  @Override
  public void ejectQuarter() {

  }

  @Override
  public void turnCrank() {

  }

  @Override
  public void dispense() {

  }
}
