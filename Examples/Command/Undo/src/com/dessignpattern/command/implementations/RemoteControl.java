package com.dessignpattern.command.implementations;

import com.dessignpattern.command.interfaces.Command;
import com.dessignpattern.command.vendor.NoCommand;

public class RemoteControl {

  private Command[] onCommands;
  private Command[] offCommands;
  private Command undoCommand;

  public RemoteControl() {
    this.onCommands = new Command[7];
    this.offCommands = new Command[7];

    Command defaultCommand = new NoCommand();
    for (int i = 0; i < 7; i++) {
      this.onCommands[i] = defaultCommand;
      this.offCommands[i] = defaultCommand;
    }
    undoCommand = defaultCommand;
  }

  public void setOnCommand(Command command, int index) {

    if (index < 0 || index > 6) {
      return;
    }
    this.onCommands[index] = command;
    undoCommand = this.onCommands[index];
  }

  public void setOffCommand(Command command, int index) {

    if (index < 0 || index > 6) {
      return;
    }

    this.offCommands[index] = command;
    undoCommand = this.offCommands[index];
  }

  public void pressOnButton(int index) {
    this.onCommands[index].execute();
  }

  public void pressOffButton(int index) {
    this.offCommands[index].execute();
  }

  public void undoButton(int index) {
    this.undoCommand.undo();
  }

  @Override
  public String toString() {

    StringBuilder result = new StringBuilder();
    for (int i = 0; i < 7; i++) {
      result.append(String.format("slot %d %s----%s%n", i, onCommands[i], offCommands[i]));
    }
    return result.toString();
  }
}
