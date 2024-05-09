package com.example.answer.ex_mammalian;

public class Human extends Mammalian {

	public Human() {
		System.out.println("人が生まれました！");
	}

	@Override
	public void eat() {
		System.out.println("野菜を食べます");
	}
}