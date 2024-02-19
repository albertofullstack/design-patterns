package com.strategy.pattern.example.model;

import com.strategy.pattern.example.behavior.WeaponBehavior;

public abstract class Character {

  public Character() {
  }

  WeaponBehavior weaponBehavior;
  
  private void setWeaponBehavior(WeaponBehavior weaponBehavior) {
    this.weaponBehavior = weaponBehavior;
  }

  public void fight() {
    weaponBehavior.useWeapon();
  }
}
