package com.strategy.pattern.example;

import com.strategy.pattern.example.model.Character;
import com.strategy.pattern.example.model.Queen;
import com.strategy.pattern.example.model.Troll;

public class Main {

  public static void main(String[] args) {
    Character queen = new Queen();
    Character troll = new Troll();
    troll.fight();
    queen.fight();
  }
}