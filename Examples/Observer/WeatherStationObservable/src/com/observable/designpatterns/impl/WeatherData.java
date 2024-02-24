package com.observable.designpatterns.impl;

import java.util.Observable;

public class WeatherData extends Observable {

  private float temperature;
  private float humidity;
  private float pressure;

  public void measurementsChanged() {
    setChanged();
    notifyObservers();
  }

  public void setMeasurements(float temp, float humidity, float pressure) {
    this.temperature = temp;
    this.pressure = pressure;
    this.humidity = humidity;
    measurementsChanged();
  }

  public float getTemperature() {
    return temperature;
  }

  public float getHumidity() {
    return humidity;
  }

  public float getPressure() {
    return pressure;
  }
}
