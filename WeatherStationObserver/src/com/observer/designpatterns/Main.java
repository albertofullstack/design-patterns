package com.observer.designpatterns;

import com.observer.designpatterns.impl.CurrentConditionsDisplay;
import com.observer.designpatterns.impl.WeatherData;

public class Main {

  public static void main(String[] args) {
    WeatherData weatherData = new WeatherData();
    CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
    weatherData.registerObserver(currentDisplay);
    weatherData.setMeasurements(4.8f, 678.9f, 3.4f);

    weatherData.removeObserver(currentDisplay);
    weatherData.setMeasurements(6.8f, 3f, 1f);
  }
}