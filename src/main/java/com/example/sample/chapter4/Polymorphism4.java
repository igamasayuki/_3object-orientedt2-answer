package com.example.sample.chapter4;

public class Polymorphism4 {
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

  // テレビを利用するメソッド
  public static void use(TV tv) {
    // 受け取ったテレビの電源ボタンを押す
    tv.power();
  }

  // パソコンを利用するメソッド
  public static void use(PC pc) {
    // 受け取ったパソコンの電源ボタンを押す
    pc.power();
  }
}
