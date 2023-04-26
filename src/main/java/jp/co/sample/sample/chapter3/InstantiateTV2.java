package jp.co.sample.sample.chapter3;

public class InstantiateTV2 {
  public static void main(String[] args) {
    
    TV hitachiTV = new TV();
    hitachiTV.changeChannel(5); // 5チャンネルにする

    hitachiTV.power(); // 電源を入れる

    hitachiTV.changeChannel(5); // 5チャンネルにする
    
  }
}
