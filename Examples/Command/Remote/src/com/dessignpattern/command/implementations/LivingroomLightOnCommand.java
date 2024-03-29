package com.dessignpattern.command.implementations;

import com.dessignpattern.command.interfaces.Command;
import com.dessignpattern.command.vendor.Light;

public class LivingroomLightOnCommand implements Command {

  private Light light;

  public LivingroomLightOnCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    this.light.on();
  }
}
