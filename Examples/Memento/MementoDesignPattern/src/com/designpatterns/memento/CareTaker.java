package com.designpatterns.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

  private List<Memento> stateList = new ArrayList();

  public void addMemento(Memento me) {
    stateList.add(me);
  }

  public Memento getMemento(int index) {
    return stateList.get(index);
  }
}
