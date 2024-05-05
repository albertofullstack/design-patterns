package com.designpatterns.mvc;

public interface QuackObservable {

  public void registerObserver(Observer observer);
  public void notifyObservers();
}
