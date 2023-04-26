package jp.co.sample.sample.chapter1;

public class Taxi extends Car {
  
  int price; // 料金を表す属性

  // 支払う操作  
  void payment(){
    System.out.println("料金を" + price + "円支払いました");
    price = 0; // 支払ったので0にする
  }

  // Carクラスのメソッドをオーバーライド
  @Override
  void stepOnAccele(){
    // speed = speed + 10;
    // System.out.println("スピードが" + speed + "km/hに増えました");
    super.stepOnAccele();

    price = price + 90;
    System.out.println("料金が" + price + "円に増えました");
  }
}
