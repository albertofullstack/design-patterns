package com.dessignpattern.command;

import com.dessignpattern.command.implementations.CeilingFanHighCommand;
import com.dessignpattern.command.implementations.CeilingFanLowCommand;
import com.dessignpattern.command.implementations.CeilingFanMediumCommand;
import com.dessignpattern.command.implementations.CeilingFanOffCommand;
import com.dessignpattern.command.implementations.CeilingFanOnCommand;
import com.dessignpattern.command.implementations.RemoteControl;
import com.dessignpattern.command.interfaces.Command;
import com.dessignpattern.command.vendor.CeilingFan;

public class CeilingFanTest {

  public static void main(String[] args) {

    CeilingFan ceilingFan = new CeilingFan("garage");

    Command ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
    Command ceilingFanLow = new CeilingFanLowCommand(ceilingFan);
    Command ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
    Command ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
    Command ceilingFanOff = new CeilingFanOffCommand(ceilingFan);


    RemoteControl simpleRemoteControl = new RemoteControl();
    simpleRemoteControl.setOnCommand(ceilingFanOn, 0);
    simpleRemoteControl.setOffCommand(ceilingFanOff, 0);
    simpleRemoteControl.setOnCommand(ceilingFanLow, 1);
    simpleRemoteControl.setOnCommand(ceilingFanMedium, 2);
    simpleRemoteControl.setOnCommand(ceilingFanHigh, 3);
    System.out.println(simpleRemoteControl);

    // turns on the fan and undo (should be off)
    simpleRemoteControl.pressOnButton(0);
    System.out.println(simpleRemoteControl);
    simpleRemoteControl.undoButton();

    // set high speed
    simpleRemoteControl.pressOnButton(3);

    // set medium speed
    simpleRemoteControl.pressOnButton(2);

    // undo medium speed (should be back to high speed)
    simpleRemoteControl.undoButton();
    System.out.println(simpleRemoteControl);

    simpleRemoteControl.undoButton();
  }
}