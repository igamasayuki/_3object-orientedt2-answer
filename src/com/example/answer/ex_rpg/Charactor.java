package com.example.answer.ex_rpg;

public class Charactor {
	private int hp;
	private String name;

	public void showHp() {
		System.out.println(name + "の現在のHP:" + hp);
	}

	public void attack(Charactor ch) {
		System.out.println(name + "のこうげき！");
		ch.downHp(5);
		ch.showHp();
	}

	public void downHp(int hp) {
		if (this.hp < hp) {
			this.hp = 0;
		} else {
			this.hp -= hp;
		}
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Charactor [hp=" + hp + ", name=" + name + "]";
	}
}
