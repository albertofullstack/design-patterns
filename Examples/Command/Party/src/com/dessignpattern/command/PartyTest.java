package com.dessignpattern.command;

import com.dessignpattern.command.implementations.CeilingFanHighCommand;
import com.dessignpattern.command.implementations.CeilingFanOffCommand;
import com.dessignpattern.command.implementations.HottubOffCommand;
import com.dessignpattern.command.implementations.HottubOnCommand;
import com.dessignpattern.command.implementations.LightOffCommand;
import com.dessignpattern.command.implementations.LightOnCommand;
import com.dessignpattern.command.implementations.MacroCommand;
import com.dessignpattern.command.implementations.RemoteControl;
import com.dessignpattern.command.implementations.StereoOffCommand;
import com.dessignpattern.command.implementations.StereoOnWithCDCommand;
import com.dessignpattern.command.interfaces.Command;
import com.dessignpattern.command.vendor.CeilingFan;
import com.dessignpattern.command.vendor.Hottub;
import com.dessignpattern.command.vendor.Light;
import com.dessignpattern.command.vendor.Stereo;

public class PartyTest {

  public static void main(String[] args) {

    CeilingFan ceilingFan = new CeilingFan("saloon");
    Command ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
    Command ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

    Light light = new Light("disco");
    Command discoLightOn = new LightOnCommand(light);
    Command discoLightOff = new LightOffCommand(light);

    Stereo stereo = new Stereo("");
    Command stereoWithCDOn = new StereoOnWithCDCommand(stereo);
    Command stereoWithCDOff = new StereoOffCommand(stereo);

    Hottub hottub = new Hottub();
    Command hottubOn = new HottubOnCommand(hottub);
    Command hottubOff = new HottubOffCommand(hottub);

    Command[] commandsOn = new Command[]{ceilingFanHigh, discoLightOn, stereoWithCDOn, hottubOn};
    Command[] commandsOff = new Command[]{ceilingFanOff, discoLightOff, stereoWithCDOff, hottubOff};
    MacroCommand commandsOnParty = new MacroCommand(commandsOn);
    MacroCommand commandsOffParty = new MacroCommand(commandsOff);

    RemoteControl simpleRemoteControl = new RemoteControl();
    simpleRemoteControl.setOnCommand(commandsOnParty, 0);
    simpleRemoteControl.setOffCommand(commandsOffParty, 0);

    simpleRemoteControl.pressOnButton(0);
    System.out.println(simpleRemoteControl);
    simpleRemoteControl.undoButton();

    simpleRemoteControl.pressOffButton(0);
    simpleRemoteControl.undoButton();
    System.out.println(simpleRemoteControl);
  }
}