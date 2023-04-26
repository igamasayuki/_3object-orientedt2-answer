package jp.co.sample.answer.ex_rpg;

public class StartApp {

	public static void main(String[] args) {
		// 勇者あらわる
		Hero loto = new Hero();
		loto.setName("ロト");
		loto.setHp(20);
		loto.show();
		System.out.println();

		// スライムの出現
		Slime metal = new Slime();
		metal.setName("メタルスライム");
		metal.setHp(10);
		metal.show();
		System.out.println();

		// スライムのこうげき！
		metal.attack(loto);

		metal.talk("「ぽよよ〜ん。」");
	}

}