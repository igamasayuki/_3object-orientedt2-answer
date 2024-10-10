package com.example.answer.ex_mammalian;

public class StartApp {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setName("ポチ");
		dog.showType();
		dog.showName();
		dog.eat();

		Cat cat = new Cat();
		cat.setName("タマ");
		cat.showType();
		cat.showName();
		cat.eat();

		Human human = new Human();
		human.setName("山田");
		human.showType();
		human.showName();
		human.eat();
		
		// 追加課題
		Mouse mouse = new Mouse();
		mouse.setName("チュー");
		mouse.showType();
		mouse.showName();
		mouse.eat();
		
	}
}