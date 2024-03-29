package com.dessignpattern.command;

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

public class RemoteControlTest {

  public static void main(String[] args) {

    Light livingroomLight = new Light("living room");
    CeilingFan ceilingFan = new CeilingFan("garage");
    GarageDoor garageDoor = new GarageDoor("house");
    Stereo stereo = new Stereo("");

    Command livingRoomLightOnCommand = new LightOnCommand(livingroomLight);
    Command livingRoomLightOffCommand = new LightOffCommand(livingroomLight);
    Command garageDoorUp = new GarageDoorOpenCommand(garageDoor);
    Command ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
    Command stereoWithCDOn = new StereoOnWithCDCommand(stereo);
    Command stereoWithCDOff = new StereoOffCommand(stereo);

    RemoteControl simpleRemoteControl = new RemoteControl();
    simpleRemoteControl.setOnCommand(livingRoomLightOnCommand, 0);
    simpleRemoteControl.setOffCommand(livingRoomLightOffCommand, 0);
    simpleRemoteControl.setOnCommand(garageDoorUp, 1);
    simpleRemoteControl.setOnCommand(ceilingFanOn, 2);
    simpleRemoteControl.setOnCommand(stereoWithCDOn, 3);
    simpleRemoteControl.setOffCommand(stereoWithCDOff, 3);

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