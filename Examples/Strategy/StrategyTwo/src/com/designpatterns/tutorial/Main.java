package com.designpatterns.tutorial;

import com.designpatterns.tutorial.controller.CreditCardAlgorithm;
import com.designpatterns.tutorial.controller.PaypalAlgorithm;
import com.designpatterns.tutorial.controller.ShoppingCart;
import com.designpatterns.tutorial.model.Product;

public class Main {

  public static void main(String[] args) {

    ShoppingCart cart = new ShoppingCart();

    Product pants = new Product("234", 25);
    Product shirt = new Product("986", 15);
    cart.addProduct(pants);
    cart.addProduct(shirt);

    // payment decisions
    cart.pay(new PaypalAlgorithm("jose@gmail.com", "1234"));
    cart.pay(new CreditCardAlgorithm("jose@gmail.com", "1234"));
  }
}