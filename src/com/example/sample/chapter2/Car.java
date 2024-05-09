package com.example.sample.chapter2;

public class Car {
  private int speed; // 速度を表す属性
  private String name; // 車名を表す属性

  // アクセルを踏む操作
  public void stepOnAccele() {
    speed = speed + 10;
    System.out.println("スピードが" + speed + "km/hに増えました");
  }

  // getter と　setter
  public int getSpeed() {
    return this.speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
