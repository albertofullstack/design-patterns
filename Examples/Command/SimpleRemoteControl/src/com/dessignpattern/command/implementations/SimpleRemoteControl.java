package com.dessignpattern.command.implementations;

import com.dessignpattern.command.interfaces.Command;

public class SimpleRemoteControl {

  private Command slot;

  public SimpleRemoteControl() {}

  public void setCommand(Command command) {
    this.slot = command;
  }

  public void pressButton() {
    this.slot.execute();
  }

}
