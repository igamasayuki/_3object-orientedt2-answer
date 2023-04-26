package jp.co.sample.sample.chapter4;

public class Car {
  int speed; // 速度を表す属性
  String name; // 車名を表す属性

  // 引数なしコンストラクタ
  Car() {
  }

  // 引数ありコンストラクタ
  Car(int speed, String name) {
    this.speed = speed;
    this.name = name;
  }

  // アクセルを踏む操作
  void stepOnAccele() {
    speed = speed + 10;
    System.out.println("スピードが" + speed + "km/hに増えました");
  }

  // ブレーキを踏む操作
  void stepOnBrake() {
    speed = speed - 10;
    System.out.println("スピードが" + speed + "km/hに減りました");
  }
}
