package com.dessignpattern.command.implementations;

import com.dessignpattern.command.interfaces.Command;
import com.dessignpattern.command.vendor.CeilingFan;

public class CeilingFanHighCommand implements Command {

  private CeilingFan ceilingFan;

  private int prevSpeed;

  public CeilingFanHighCommand(CeilingFan ceilingFan) {
    this.ceilingFan = ceilingFan;
  }

  @Override
  public void execute() {
    prevSpeed = this.ceilingFan.getSpeed();
    this.ceilingFan.high();
  }

  @Override
  public void undo() {
    switch (prevSpeed) {
      case CeilingFan.HIGH:
        this.ceilingFan.high();
        break;
      case CeilingFan.MEDIUM:
        this.ceilingFan.medium();
        break;
      case CeilingFan.LOW:
        this.ceilingFan.low();
        break;
    }
  }
}
