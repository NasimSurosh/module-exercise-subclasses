package com.math.operation;

public class MathOperation {
  
  public int addition(int a, int b) {
    int result = a+b;
    System.out.println("The addition of two numbers is = " +result);
    return result;
  }
  public int subtraction(int a, int b) {
    int result = a-b;
    System.out.println("The subtracted number is = "+ result);
    return result;
  }
  public int muiltiplication(int a, int b) {
    int result = a*b;
    System.out.println("The subtraction of two numbers is = "+ result);
    return result;
  }
  public double division(double a, double b) {
    double result = a/b;
    if(b==0) { 
      System.out.println("The result is = " + result);
      return 0.0;
    }else {
      System.out.println("The division of two numbers is = " + result);
      return result;
    }
      
  }

}
