package com.example.answer.ex_rpg;

public class Slime extends Monstar {
	public void talk(String message) {
		System.out.println(super.getName() + ":" + message);
	}
}
