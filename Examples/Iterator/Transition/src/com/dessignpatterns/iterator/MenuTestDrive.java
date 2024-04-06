package com.dessignpatterns.iterator;

import com.dessignpatterns.iterator.interfaces.Menu;
import com.dessignpatterns.iterator.models.CafeMenu;
import com.dessignpatterns.iterator.models.DinerMenu;
import com.dessignpatterns.iterator.models.PancakeHouseMenu;
import com.dessignpatterns.iterator.models.Waitress;
import java.util.List;

public class MenuTestDrive {

  public static void main(String[] args) {

    Menu pancakeMenu = new PancakeHouseMenu();
    Menu dinerMenu = new DinerMenu();
    Menu cafeMenu = new CafeMenu();
    List<Menu> menus = List.of(pancakeMenu, dinerMenu, cafeMenu);

    Waitress waitress = new Waitress(menus);
    waitress.printMenu();
  }
}