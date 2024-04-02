package com.dessignpatterns.iterator;

import com.dessignpatterns.iterator.interfaces.Menu;
import com.dessignpatterns.iterator.models.DinerMenu;
import com.dessignpatterns.iterator.models.PancakeHouseMenu;
import com.dessignpatterns.iterator.models.Waitress;

public class MenuTestDrive {

  public static void main(String[] args) {

    Menu pancakeMenu = new PancakeHouseMenu();
    Menu dinerMenu = new DinerMenu();

    Waitress waitress = new Waitress(dinerMenu, pancakeMenu);
    waitress.printMenu();
  }
}