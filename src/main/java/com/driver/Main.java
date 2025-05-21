package com.driver;

public class Main {
  public static void main(String[] args){
    Product p=new Product();
    System.out.println("Product of two number is: "+p.product(2,3));
    System.out.println("Product of three number is: "+p.product(2,3,4));
    System.out.println("Product of double type number is: "+p.product(2.5,3.5));
  }
  class Product{
    public int product(int x, int y) {
      return x*y;
    }
    public int product(int x, int y, int z) {
      return x*y*z;
    }
    public double product(double x, double y) {
      return x*y;
    }
  }
}
