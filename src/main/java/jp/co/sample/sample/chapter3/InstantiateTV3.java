package jp.co.sample.sample.chapter3;

public class InstantiateTV3 {
  public static void main(String[] args) {

    // staticメソッドの呼び出し(インスタンス化しない)
    Electrical2.showFullChargeValue();

    TV2 toshibaTV = new TV2();
    // defaultメソッドの呼び出し
    toshibaTV.plugin(); // コンセントを指す

    // 今まで通りテレビとして扱うことが可能
    toshibaTV.power(); // 電源を入れる
    toshibaTV.changeChannel(5); // 5チャンネルにする

  }
}
