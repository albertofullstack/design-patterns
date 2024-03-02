package com.radiostation.observer.designpattern;

import com.radiostation.observer.designpattern.interfaces.Observer;
import com.radiostation.observer.designpattern.interfaces.Subject;
import com.radiostation.observer.designpattern.model.Listener;
import com.radiostation.observer.designpattern.model.RadioStation;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class RadioStationTest {

  public static void main(String[] args) {

    List<String> freshNews = List.of("Hey hey hey, this is radio station!!!", "Iron Maiden singing live!!!!", "Let's rock baby");
    Subject radioStation = new RadioStation(freshNews);
    Observer fan1 = new Listener();
    radioStation.registerObserver(fan1);

    System.out.println("Broadcast try 1");
    radioStation.broadcast();

    System.out.println("Broadcast try 2");
    radioStation.setChanged();
    radioStation.broadcast();

    System.out.println("The show begins!!!");
    Observer fan2 = new Listener();
    Observer fan3 = new Listener();
    Observer fan4 = new Listener();
    Observer fan5 = new Listener();
    IntStream.range(1, 10).forEach(number -> {
      radioStation.setChanged();
      List<String> superbMusic = List.of("tiriri", "tiriritiriri", "titiiiiiriiiiiiiiii");
      fan2.update(null, superbMusic);
    });
  }
}