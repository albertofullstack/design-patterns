package com.radiostation.observer.designpattern.interfaces;

import java.util.List;

public interface Subject {

  public void registerObserver(Observer o);

  public void removeObserver(Observer o);

  public void notifyObservers(List<String> news);

  public void setChanged();

  public boolean getChanged();

  public void broadcast();
}
