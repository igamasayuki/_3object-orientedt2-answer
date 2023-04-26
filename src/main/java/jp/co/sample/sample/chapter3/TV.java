package jp.co.sample.sample.chapter3;

public class TV implements Electrical {

  // 電源ON/OFFを表す
  private boolean powerOn; // 電源ON:true 電源OFF:false
  // チャンネル
  private int channel;

  // インターフェースで定義されている抽象メソッドを実装
  // 実装しなければコンパイルエラー
  @Override
  public void power() {
    if (powerOn) {
      // 電源が入っていた場合
      System.out.println("テレビの電源が切れました");
      powerOn = false;
    } else {
      // 電源が切れていた場合
      System.out.println("テレビの電源が入りました");
      powerOn = true;
    }
  }

  // チャンネルを切り替える操作
  public void changeChannel(int channel) {
    if (!powerOn) {
      System.out.println("テレビの電源を入れてください");
      return;
    }
    this.channel = channel;
    System.out.println(this.channel + "チャンネルに切り替わりました");
  }
}
