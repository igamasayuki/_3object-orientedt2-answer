package jp.co.sample.sample.chapter4;

public class Polymorphism3 {
  public static void main(String[] args) {

    // TVオブジェクトをインスタンス化
    TV tv = new TV();
    // PCオブジェクトをインスタンス化
    PC pc = new PC();

    // TVを利用する
    use(tv);
    // PCを利用する
    use(pc);
  }

  // 製品を利用するメソッド
  public static void use(Electrical eleItem){
    // 受け取った電化製品の電源ボタンを押す
    eleItem.power();
  }
}
