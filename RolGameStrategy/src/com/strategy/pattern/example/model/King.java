package com.strategy.pattern.example.model;

import com.strategy.pattern.example.behavior.AxeBehavior;

public class King extends Character {

  public King() {
    this.weaponBehavior = new AxeBehavior();
  }
}
