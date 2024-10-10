package com.example.sample.chapter4;

public class Polymorphism {
  public static void main(String[] args) {
    
    Car car = new Taxi();

    car.stepOnAccele(); // OK

    car.stepOnBrake(); // OK

    // car.payment(); // コンパイルエラー
  }
}
