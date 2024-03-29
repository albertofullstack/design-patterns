package com.dessignpattern.command.implementations;

import com.dessignpattern.command.interfaces.Command;
import com.dessignpattern.command.vendor.Light;

public class LivingroomLightOffCommand implements Command {

  private Light light;

  public LivingroomLightOffCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    this.light.off();
  }

  @Override
  public void undo() {
    this.light.on();
  }
}
