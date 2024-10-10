package com.example.sample.chapter2;

public class TV {
  
  // チャンネル
  int channel;

  // チャンネルを切り替える操作
  void changeChannel(int channel){
    if(channel <= 0 || 13 <= channel){
      System.out.println("チャンネルは1〜12までの間で設定してください");
      return;
      // 以下のような実装にすることも多い
      // throw new Exception("チャンネルは1〜12までの間で設定してください");
    }
    this.channel = channel;
    System.out.println(this.channel + "チャンネルに切り替わりました");
  }

}
