package com.designpattern.visitor;

public class Main {

  public static void main(String[] args) {

    TaxVisitor taxVisitor = new TaxVisitor();
    Jacket jacket = new Jacket(35.65);
    System.out.println(jacket.accept(taxVisitor));

    TShirt tShirt = new TShirt(35.65);
    System.out.println(tShirt.accept(taxVisitor));

    Shirt shirt = new Shirt(35.65);
    System.out.println(shirt.accept(taxVisitor));
  }
}