package com.strategy.pattern.example.behavior;

public class SwordBehavior implements WeaponBehavior {

  @Override
  public void useWeapon() {
    System.out.println("Pierce!!!");
  }
}
