package com.designpattern.visitor;

public interface Visitor {

  double visitor(Shirt shirtItem);
  double visitor(TShirt tshirt);
  double visitor(Jacket jacket);
}
