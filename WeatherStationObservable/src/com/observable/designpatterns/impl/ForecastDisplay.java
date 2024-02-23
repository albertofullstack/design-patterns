package com.observable.designpatterns.impl;

import com.observable.designpatterns.interfaces.DisplayElement;
import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {

  private float currentPressure = 29.92f;
  private float lastPressure;
  private Observable weatherData;

  public ForecastDisplay(Observable weatherData) {
    this.weatherData = weatherData;
    weatherData.addObserver(this);
  }

  public void update(Observable o, Object obs) {

    if (o instanceof WeatherData) {
      WeatherData weatherData1 = (WeatherData) o;
      lastPressure = currentPressure;
      currentPressure = weatherData1.getPressure();

      display();
    }
  }

  public void display() {
    System.out.print("Forecast: ");
    if (currentPressure > lastPressure) {
      System.out.println("Improving weather on the way!");
    } else if (currentPressure == lastPressure) {
      System.out.println("More of the same");
    } else if (currentPressure < lastPressure) {
      System.out.println("Watch out for cooler, rainy weather");
    }
  }
}
