package com.observable.designpatterns;

import com.observable.designpatterns.impl.CurrentConditionsDisplay;
import com.observable.designpatterns.impl.ForecastDisplay;
import com.observable.designpatterns.impl.StatisticsDisplay;
import com.observable.designpatterns.impl.WeatherData;

public class WeatherStation {

  public static void main(String[] args) {
    WeatherData weatherData = new WeatherData();
    CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
    ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
    StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
    weatherData.setMeasurements(80, 65, 30.4f);
    weatherData.setMeasurements(82, 70, 29.2f);
    weatherData.setMeasurements(78, 90, 29.2f);
  }
}