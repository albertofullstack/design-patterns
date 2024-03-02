package com.radiostation.observer.designpattern.model;

import com.radiostation.observer.designpattern.interfaces.Observer;
import com.radiostation.observer.designpattern.interfaces.Subject;
import java.util.List;

public class Listener implements Observer {

  private Subject subject;

  @Override
  public void update(Subject s, Object o) {
    if (o == null) {
      RadioStation radio = (RadioStation) s;
      checkNews(radio.getNews());
     } else {
      if (o instanceof List) {
        List<String> news = (List<String>) o;
        checkNews(news);
      }
    }
  }

  public void checkNews(List<String> news) {
    for (String info : news) {
      System.out.printf("Receiving news from radio: %s%n", info);
    }
  }
}
