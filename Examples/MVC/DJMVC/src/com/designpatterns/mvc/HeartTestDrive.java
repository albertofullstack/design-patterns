package com.designpatterns.mvc;

public class HeartTestDrive {
  public static void main (String[] args) {
    HeartModel heartModel = new HeartModel();
    new HeartController(heartModel);
  }
}
