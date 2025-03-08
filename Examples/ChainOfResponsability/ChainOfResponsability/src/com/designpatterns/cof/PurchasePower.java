package com.designpatterns.cof;

public abstract class PurchasePower {

  protected static final double BASE = 1000;
  protected PurchasePower succesor;
  abstract protected double getAllowable();
  abstract protected String getRole();

  public void setSuccesor(PurchasePower succesor) {
    this.succesor = succesor;
  }

  public PurchasePower getSuccesor() {
    return succesor;
  }

  public void processRequest(PurchaseRequest request) {
    if (request.getAmount() < this.getAllowable()) {
      System.out.println(this.getRole() + " will approve $" + request.getAmount());
    } else if (succesor != null){
      succesor.processRequest(request);
    }
  }
}
