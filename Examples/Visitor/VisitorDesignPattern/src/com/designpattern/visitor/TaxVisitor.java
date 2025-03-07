package com.designpattern.visitor;

import java.text.DecimalFormat;

public class TaxVisitor implements Visitor {

  DecimalFormat df = new DecimalFormat("##,##");


  @Override
  public double visitor(Shirt shirtItem) {
    System.out.println("Shirt final price with tax");
    return Double.parseDouble(df.format(shirtItem.getPrice() * .10 + shirtItem.getPrice()));
  }

  @Override
  public double visitor(TShirt tshirt) {
    System.out.println("TShirt final price with tax");
    return Double.parseDouble(df.format(tshirt.getPrice() * .18 + tshirt.getPrice()));
  }

  @Override
  public double visitor(Jacket jacket) {
    System.out.println("Jacket final price with tax");
    return Double.parseDouble(df.format(jacket.getPrice() * .22 + jacket.getPrice()));
  }
}
