package com.strategy.pattern.example.model;

import com.strategy.pattern.example.behavior.SwordBehavior;

public class Knight extends Character {

  public Knight() {
    this.weaponBehavior = new SwordBehavior();
  }
}
