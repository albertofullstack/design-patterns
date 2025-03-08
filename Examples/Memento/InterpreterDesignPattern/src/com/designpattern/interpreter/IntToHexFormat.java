package com.designpattern.interpreter;

public class IntToHexFormat implements Expression {

  private int i;
  public IntToHexFormat(int i) {
    this.i = i;
  }

  @Override
  public String interpreter(InterpreterContext context) {
    return context.getHexFormat(i);
  }
}
