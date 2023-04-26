package jp.co.sample.answer.ex_mammalian;

public class Mouse extends Mammalian{

	public Mouse() {
		System.out.println("ねずみが生まれました！");
	}
	
	@Override
	public void eat() {
		System.out.println("チーズを食べます");
	}
}
