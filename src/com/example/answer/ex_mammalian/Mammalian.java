package com.example.answer.ex_mammalian;

public class Mammalian {
	private String name;
	
	public void showType() {
		System.out.println("哺乳類です");
	}
	public void showName() {
		System.out.println("私の名前は" + name + "です");
	}
	
	public void eat() {
		System.out.println("生き物を食べます");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}