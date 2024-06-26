package com.designpatterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class NonOwnerInvocationHandler implements InvocationHandler {

  PersonBean person;

  public NonOwnerInvocationHandler(PersonBean person) {
    this.person = person;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {

    try {
      if (method.getName().equals("setHotOrNotRating")) {
        return method.invoke(person, args);
      } else if (method.getName().startsWith("set")) {
        throw new IllegalAccessException();
      } else if (method.getName().startsWith("get")) {
        return method.invoke(person, args);
      }
    } catch (InvocationTargetException e) {
      e.printStackTrace();
    }
    return null;
  }
}
