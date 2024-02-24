package com.strategy.pattern.example.behavior;

public class KnifeBehavior implements WeaponBehavior {

  @Override
  public void useWeapon() {
    System.out.println("Cut!!!");
  }
}
