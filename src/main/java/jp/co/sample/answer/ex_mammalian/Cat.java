package jp.co.sample.answer.ex_mammalian;

public class Cat extends Mammalian{

	public Cat() {
		System.out.println("猫が生まれました！");
	}
	
	@Override
	public void eat() {
		System.out.println("魚を食べます");
	}
}

