package com.example.answer;

public class Ex04Car {
	private int speed; // 速度を表す属性
	private String name; // 車名を表す属性

	// 引数なしコンストラクタ
	public Ex04Car() {
	}

	// 引数ありコンストラクタ
	public Ex04Car(int speed, String name) {
		this.speed = speed;
		this.name = name;
	}

	// アクセルを踏む操作
	public void stepOnAccele() {
		speed = speed + 10;
		System.out.println("スピードが" + speed + "km/hに増えました");
	}

	// ブレーキを踏む操作
	public void stepOnBrake() {
		speed = speed - 10;
		System.out.println("スピードが" + speed + "km/hに減りました");
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
