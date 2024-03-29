package com.dessignpattern.command.implementations;

import com.dessignpattern.command.interfaces.Command;
import com.dessignpattern.command.vendor.NoCommand;
import java.util.Arrays;

public class RemoteControl {

  private Command[] onCommands;
  private Command[] offCommands;

  public RemoteControl() {
    this.onCommands = new Command[7];
    this.offCommands = new Command[7];

    Command defaultCommand = new NoCommand();
    for (int i = 0; i < 7; i++) {
      this.onCommands[i] = defaultCommand;
      this.offCommands[i] = defaultCommand;
    }
  }

  public void setOnCommand(Command command, int index) {

    if (index < 0 || index > 6) {
      return;
    }
    this.onCommands[index] = command;
  }

  public void setOffCommand(Command command, int index) {

    if (index < 0 || index > 6) {
      return;
    }

    this.offCommands[index] = command;
  }

  public void pressOnButton(int index) {
    this.onCommands[index].execute();
  }

  public void pressOffButton(int index) {
    this.offCommands[index].execute();
  }

  @Override
  public String toString() {
    return "RemoteControl{" +
        "onCommands=" + Arrays.toString(onCommands) +
        ", offCommands=" + Arrays.toString(offCommands) +
        '}';
  }
}
