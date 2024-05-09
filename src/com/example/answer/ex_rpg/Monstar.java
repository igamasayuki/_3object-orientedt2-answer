package com.example.answer.ex_rpg;

public class Monstar extends Charactor implements Appear {
	@Override
	public void show() {
		System.out.println(super.getName() + "が現れた！");
		super.showHp();
	}
}
