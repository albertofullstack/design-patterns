package com.designpatterns.com;

import com.designpatterns.com.controller.ScoreBoard;
import com.designpatterns.com.model.Balloon;
import com.designpatterns.com.model.Clown;
import com.designpatterns.com.model.SquareBalloon;

public class App {

  public static void main(String[] args) {

    ScoreBoard scoreBoard = new ScoreBoard();

    System.out.print("Balloon Tap Score: ");
    scoreBoard.algorithmBase = new Balloon();
    scoreBoard.showScore(10, 5);

    System.out.print("Clown Tap Score: ");
    scoreBoard.algorithmBase = new Clown();
    scoreBoard.showScore(10, 5);

    System.out.print("Square Balloon Score: ");
    scoreBoard.algorithmBase = new SquareBalloon();
    scoreBoard.showScore(10, 5);
  }
}
