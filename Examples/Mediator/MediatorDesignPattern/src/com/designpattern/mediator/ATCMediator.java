package com.designpattern.mediator;

public interface ATCMediator {

  void sendMessage(String msg, AirCraft airCraft);

  void addAirCraft(AirCraft airCraft);

}
