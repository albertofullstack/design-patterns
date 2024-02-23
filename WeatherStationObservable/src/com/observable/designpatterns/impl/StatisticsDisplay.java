package com.observable.designpatterns.impl;

import com.observable.designpatterns.interfaces.DisplayElement;
import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {

  private float maxTemp = 0.0f;
  private float minTemp = 200;
  private float tempSum = 0.0f;
  private int numReadings;
  private Observable weatherData;

  public StatisticsDisplay(Observable weatherData) {
    this.weatherData = weatherData;
    weatherData.addObserver(this);
  }

  public void update(Observable o, Object arg) {

    if (o instanceof WeatherData) {
      WeatherData weatherData1 = (WeatherData) o;
      float temperature = weatherData1.getTemperature();
      tempSum += temperature;
      numReadings++;

      if (weatherData1.getTemperature() > maxTemp) {
        maxTemp = temperature;
      }

      if (weatherData1.getTemperature() < minTemp) {
        minTemp = temperature;
      }

      display();
    }
  }

  public void display() {
    System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
        + "/" + maxTemp + "/" + minTemp);
  }
}
