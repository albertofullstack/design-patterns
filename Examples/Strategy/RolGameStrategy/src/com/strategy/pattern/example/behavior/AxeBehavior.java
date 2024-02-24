package com.strategy.pattern.example.behavior;

public class AxeBehavior implements WeaponBehavior {

  @Override
  public void useWeapon() {
    System.out.println("Behead!!!");
  }
}
