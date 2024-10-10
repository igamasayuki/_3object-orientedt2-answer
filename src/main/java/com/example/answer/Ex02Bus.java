package com.example.answer;

public class Ex02Bus extends Car {
  int price;

  @Override
  void stepOnAccele() {
    speed = speed + 10;
    System.out.println("スピードは" + speed + "km/hです");

    price = price + 30;
    System.out.println("料金は"  + price + "円です");
  }
}
