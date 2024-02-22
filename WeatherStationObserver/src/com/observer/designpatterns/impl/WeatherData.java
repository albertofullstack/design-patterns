package com.observer.designpatterns.impl;

import com.observer.designpatterns.interfaces.Observer;
import com.observer.designpatterns.interfaces.Subject;
import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

  private List<Observer> observerList;
  private float temperature;
  private float humidity;
  private float pressure;

  public WeatherData() {
    this.observerList = new ArrayList<>();
  }

  @Override
  public void registerObserver(Observer o) {
    if (o == null) {
      throw new NullPointerException("Observer is null");
    }
    observerList.add(o);
  }

  @Override
  public void removeObserver(Observer o) {
    observerList.remove(o);
  }

  @Override
  public void notifyObservers() {
    observerList.forEach(observer -> {
      observer.update(temperature, humidity, pressure);
    });
  }

  public void measurementsChanged() {
    notifyObservers();
  }

  public void setMeasurements(float temp, float pressure, float humidity) {
    this.temperature = temp;
    this.pressure = pressure;
    this.humidity = humidity;
    measurementsChanged();
  }
}
