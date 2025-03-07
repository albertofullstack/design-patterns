package com.designpattern.mediator;

import java.util.ArrayList;
import java.util.List;

public class ATCMediatorImpl implements ATCMediator {

  private List<AirCraft> airCraftList;

  public ATCMediatorImpl() {
    this.airCraftList = new ArrayList<>();
  }

  @Override
  public void sendMessage(String msg, AirCraft airCraft) {
    for (AirCraft airCraftItem : airCraftList) {

      // message should not be received by the aircraft sending the message
      if (airCraftItem != airCraft) {
        airCraftItem.receive(msg);
      }
    }
  }

  @Override
  public void addAirCraft(AirCraft airCraft) {
    this.airCraftList.add(airCraft);
  }
}
