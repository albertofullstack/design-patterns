package com.dessignpattern.command;

import com.dessignpattern.command.implementations.GarageDoorOpenCommand;
import com.dessignpattern.command.implementations.LightOnCommand;
import com.dessignpattern.command.implementations.SimpleRemoteControl;
import com.dessignpattern.command.interfaces.Command;
import com.dessignpattern.command.vendor.GarageDoor;
import com.dessignpattern.command.vendor.Light;

public class RemoteControlTest {

  public static void main(String[] args) {

    Light light = new Light();
    Command lightsOn = new LightOnCommand(light);

    GarageDoor garageDoor = new GarageDoor();
    Command openGarageDoor = new GarageDoorOpenCommand(garageDoor);

    SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
    simpleRemoteControl.setCommand(lightsOn);
    simpleRemoteControl.pressButton();

    simpleRemoteControl.setCommand(openGarageDoor);
    simpleRemoteControl.pressButton();
  }
}