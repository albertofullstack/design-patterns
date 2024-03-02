package com.radiostation.observer.designpattern.model;

import com.radiostation.observer.designpattern.interfaces.Observer;
import com.radiostation.observer.designpattern.interfaces.Subject;
import java.util.ArrayList;
import java.util.List;

public class RadioStation implements Subject {

  private List<Observer> observers;

  private List<String> news;

  private boolean isChanged;

  public RadioStation(List<String> news) {
    observers = new ArrayList<>();
    this.news = news;
  }
  @Override
  public void registerObserver(Observer o) {
    if (o == null) {
      throw new NullPointerException("The observer is null");
    }
    observers.add(o);
  }

  @Override
  public void removeObserver(Observer o) {
    observers.remove(o);
  }

  @Override
  public void notifyObservers(List<String> news) {
    for (Observer o : observers) {
      o.update(this, news);
    }
  }

  @Override
  public void setChanged() {
    isChanged = !isChanged;
  }

  @Override
  public boolean getChanged() {
    return isChanged;
  }

  public void broadcast() {
    if (isChanged) {
      this.notifyObservers(this.getNews());
    }
  }

  public List<String> getNews() {
    return this.news;
  }
}
