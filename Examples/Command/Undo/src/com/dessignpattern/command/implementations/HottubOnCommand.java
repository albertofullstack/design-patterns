package com.dessignpattern.command.implementations;

import com.dessignpattern.command.interfaces.Command;
import com.dessignpattern.command.vendor.Hottub;

public class HottubOnCommand implements Command {

  private Hottub hottub;

  public HottubOnCommand(Hottub hottub) {
    this.hottub = hottub;
  }

  @Override
  public void execute() {
    this.hottub.on();
  }

  @Override
  public void undo() {
    this.hottub.off();
  }
}
