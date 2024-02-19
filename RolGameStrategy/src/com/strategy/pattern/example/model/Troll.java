package com.strategy.pattern.example.model;

import com.strategy.pattern.example.behavior.KnifeBehavior;

public class Troll extends Character {

  public Troll() {
    this.weaponBehavior = new KnifeBehavior();
  }
}
