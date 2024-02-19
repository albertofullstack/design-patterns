package com.strategy.pattern.example.model;

import com.strategy.pattern.example.behavior.BowAndArrowBehavior;

public class Queen extends Character {

  public Queen() {
    this.weaponBehavior = new BowAndArrowBehavior();
  }
}
