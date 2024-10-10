package com.example.sample.chapter1;

public class InstantiateTaxi {
  public static void main(String[] args) {
    
    // TaxiクラスからTaxiオブジェクトをインスタンス化
    Taxi taxi = new Taxi();

    taxi.speed = 0;
    taxi.name = "タクシー仕様のプリウス";

    taxi.stepOnAccele(); // アクセルを踏む
    taxi.stepOnAccele(); // アクセルを踏む
    taxi.stepOnBrake(); // ブレーキを踏む

    // 現在の速度を表示する
    System.out.println("現在の速度は" + taxi.speed + "km/hです。");
  }
}
