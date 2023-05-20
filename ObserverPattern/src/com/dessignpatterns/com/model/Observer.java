package com.dessignpatterns.com.model;

import com.dessignpatterns.com.interfaces.Subject;

public interface Observer {

  public void udpate();

  public void setSubject(Subject subject);
}
