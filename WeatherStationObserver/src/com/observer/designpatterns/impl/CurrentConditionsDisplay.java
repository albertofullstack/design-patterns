package com.observer.designpatterns.impl;

import com.observer.designpatterns.interfaces.DisplayElement;
import com.observer.designpatterns.interfaces.Observer;
import com.observer.designpatterns.interfaces.Subject;

public class CurrentConditionsDisplay implements DisplayElement, Observer {

  private float temp;
  private float humidity;
  private Subject weatherData;

  public CurrentConditionsDisplay(Subject weatherData) {
    this.weatherData = weatherData;
  }

  @Override
  public void display() {
    System.out.printf("Currents conditions %sF degrees and %s%% humidity\n", this.temp,
        this.humidity);
  }

  @Override
  public void update(float temp, float humidity, float pressure) {
    this.temp = temp;
    this.humidity = humidity;
    display();
  }
}
