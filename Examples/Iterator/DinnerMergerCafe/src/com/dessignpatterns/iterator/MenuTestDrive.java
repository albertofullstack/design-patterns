package com.dessignpatterns.iterator;

import com.dessignpatterns.iterator.interfaces.Menu;
import com.dessignpatterns.iterator.models.CafeMenu;
import com.dessignpatterns.iterator.models.DinerMenu;
import com.dessignpatterns.iterator.models.PancakeHouseMenu;
import com.dessignpatterns.iterator.models.Waitress;

public class MenuTestDrive {

  public static void main(String[] args) {

    Menu pancakeMenu = new PancakeHouseMenu();
    Menu dinerMenu = new DinerMenu();
    Menu cafeMenu = new CafeMenu();

    Waitress waitress = new Waitress(dinerMenu, pancakeMenu, cafeMenu);
    waitress.printMenu();
  }
}