package com.designpattern.interpreter.interpreter;

public class Main {

  public InterpreterContext context;

  public static void main(String[] args) {
    String first = "13 in Binary";
    String second = "28 in Hexadecimal";

    Main main = new Main(new InterpreterContext());
    System.out.println(first + " = " + main.interpret(first));
    System.out.println(second + " = " + main.interpret(second));
  }

  public Main(InterpreterContext context) {
    this.context = context;
  }

  public String interpret(String str) {
    Expression expression = null;
    if (str.contains("Hexadecimal")) {
      expression = new IntToHexFormat(Integer.parseInt(str.substring(0, str.indexOf(" "))));
    } else if (str.contains("Binary")) {
      expression = new IntToBinaryExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
    } else {
      return str;
    }
    return expression.interpreter(context);
  }
}