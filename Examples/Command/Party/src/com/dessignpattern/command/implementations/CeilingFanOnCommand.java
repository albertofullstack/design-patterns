package com.dessignpattern.command.implementations;

import com.dessignpattern.command.interfaces.Command;
import com.dessignpattern.command.vendor.CeilingFan;

public class CeilingFanOnCommand implements Command {

  private CeilingFan ceilingFan;

  public CeilingFanOnCommand(CeilingFan ceilingFan) {
    this.ceilingFan = ceilingFan;
  }

  @Override
  public void execute() {
    this.ceilingFan.high();
  }

  @Override
  public void undo() {
    this.ceilingFan.off();
  }
}
