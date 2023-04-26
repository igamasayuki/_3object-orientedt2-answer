package jp.co.sample.answer.ex_rpg;

public class Hero extends Charactor implements Appear {
	@Override
	public void show() {
		System.out.println("勇者" + super.getName() + "の登場！");
		showHp();
	}
}