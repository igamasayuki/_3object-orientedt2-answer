package com.example.sample.chapter1;

public class InstantiateTaxi2 {
  public static void main(String[] args) {
    
    // TaxiクラスからTaxiオブジェクトをインスタンス化
    Taxi taxi = new Taxi();

    taxi.speed = 10;
    taxi.price = 1000; // 料金を1000円にする

    taxi.stepOnAccele();
    taxi.payment(); // 支払う
  }
}
