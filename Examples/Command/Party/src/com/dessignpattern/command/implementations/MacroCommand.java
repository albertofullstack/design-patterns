package com.dessignpattern.command.implementations;

import com.dessignpattern.command.interfaces.Command;
import java.util.Arrays;

public class MacroCommand implements Command {

  private Command[] commands;

  public MacroCommand(Command[] commands) {
    this.commands = commands;
  }

  @Override
  public void execute() {
    Arrays.asList(commands).forEach(Command::execute);
  }

  @Override
  public void undo() {
    Arrays.asList(commands).forEach(Command::undo);
  }
}
