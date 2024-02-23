package com.observable.designpatterns.impl;

import com.observable.designpatterns.interfaces.DisplayElement;
import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements DisplayElement, Observer {

  private float temperature;
  private float humidity;
  private Observable weatherData;

  public CurrentConditionsDisplay(Observable weatherData) {
    this.weatherData = weatherData;
    weatherData.addObserver(this);
  }

  public void display() {
    System.out.println("Current conditions: " + temperature
        + "F degrees and " + humidity + "% humidity");
  }

  @Override
  public void update(Observable o, Object arg) {
    if (o instanceof WeatherData) {
      WeatherData weatherData1 = (WeatherData) o;
      this.temperature = weatherData1.getTemperature();
      this.humidity = weatherData1.getTemperature();
      display();
    }
  }
}
