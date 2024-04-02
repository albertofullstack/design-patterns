package com.dessignpatterns.iterator;

import com.dessignpatterns.iterator.models.DinerMenu;
import com.dessignpatterns.iterator.models.PancakeHouseMenu;
import com.dessignpatterns.iterator.models.Waitress;

public class MenuTestDrive {

  public static void main(String[] args) {

    Waitress waitress = new Waitress();
    waitress.printMenu();
  }
}