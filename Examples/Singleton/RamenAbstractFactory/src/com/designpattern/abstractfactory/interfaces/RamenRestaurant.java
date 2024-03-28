package com.designpattern.abstractfactory.interfaces;

import com.designpattern.abstractfactory.models.Ramen;

public abstract class RamenRestaurant {

  public Ramen orderRamen(String type) {

    Ramen ramen = createRamen(type);
    ramen.prepare();
    ramen.serve();
    return ramen;
  }

  protected abstract Ramen createRamen(String type);
}
