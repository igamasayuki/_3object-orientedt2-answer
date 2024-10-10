package com.example.answer.ex_zoo;

public class Zoo {

	public static void main(String[] args) {

		Animal animals[] = { new Sheep(), new Horse(), new Goat(), new Monkey(), new Bear() };

		System.out.println("==通常for文利用======");
		for (int i = 0; i < animals.length; i = i + 1) {
			animals[i].cry();
		}

		System.out.println("==拡張for文利用======");
		for (Animal animal : animals) {
			animal.cry();
		}
	}
}