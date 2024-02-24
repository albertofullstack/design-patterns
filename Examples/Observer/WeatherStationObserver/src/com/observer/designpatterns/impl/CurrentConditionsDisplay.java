package com.observer.designpatterns.impl;

import com.observer.designpatterns.interfaces.DisplayElement;
import com.observer.designpatterns.interfaces.Observer;
import com.observer.designpatterns.interfaces.Subject;

public class CurrentConditionsDisplay implements DisplayElement, Observer {

  private float temperature;
  private float humidity;
  private Subject weatherData;

  public CurrentConditionsDisplay(Subject weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  public void update(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    display();
  }

  public void display() {
    System.out.println("Current conditions: " + temperature
        + "F degrees and " + humidity + "% humidity");
  }
}
