package com.dessignpattern.command.implementations;

import com.dessignpattern.command.interfaces.Command;
import com.dessignpattern.command.vendor.CeilingFan;
import com.dessignpattern.command.vendor.Hottub;

public class HottubOffCommand implements Command {

  private Hottub hottub;

  public HottubOffCommand(Hottub hottub) {
    this.hottub = hottub;
  }

  @Override
  public void execute() {
    this.hottub.off();
  }
}
