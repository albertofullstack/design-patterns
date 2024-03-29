package com.dessignpattern.command;

import com.dessignpattern.command.implementations.CeilingFanHighCommand;
import com.dessignpattern.command.implementations.CeilingFanLowCommand;
import com.dessignpattern.command.implementations.CeilingFanMediumCommand;
import com.dessignpattern.command.implementations.CeilingFanOffCommand;
import com.dessignpattern.command.implementations.CeilingFanOnCommand;
import com.dessignpattern.command.implementations.GarageDoorOpenCommand;
import com.dessignpattern.command.implementations.LightOffCommand;
import com.dessignpattern.command.implementations.LightOnCommand;
import com.dessignpattern.command.implementations.RemoteControl;
import com.dessignpattern.command.implementations.StereoOffCommand;
import com.dessignpattern.command.implementations.StereoOnWithCDCommand;
import com.dessignpattern.command.interfaces.Command;
import com.dessignpattern.command.vendor.CeilingFan;
import com.dessignpattern.command.vendor.GarageDoor;
import com.dessignpattern.command.vendor.Light;
import com.dessignpattern.command.vendor.Stereo;

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
    simpleRemoteControl.pressOnButton(4);
    simpleRemoteControl.pressOnButton(2);

    // the ceiling fan is off when undo
    simpleRemoteControl.undoButton();
    simpleRemoteControl.pressOffButton(0);
    simpleRemoteControl.pressOnButton(3);
    simpleRemoteControl.pressOffButton(3);
    simpleRemoteControl.undoButton();
    System.out.println(simpleRemoteControl);

    // this executes no command
    simpleRemoteControl.pressOnButton(6);
    simpleRemoteControl.undoButton();
  }
}