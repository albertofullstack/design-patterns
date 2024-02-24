package com.strategy.pattern.example.behavior;

public class BowAndArrowBehavior implements WeaponBehavior {

  @Override
  public void useWeapon() {
    System.out.println("Arrow shot!!!");
  }
}
