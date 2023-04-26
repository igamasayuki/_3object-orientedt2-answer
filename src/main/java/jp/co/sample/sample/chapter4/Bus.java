package jp.co.sample.sample.chapter4;

public class Bus extends Car {
  int price;

  @Override
  void stepOnAccele() {
    super.stepOnAccele();

    price = price + 30;
    System.out.println("料金は"  + price + "円です");
  }
}
