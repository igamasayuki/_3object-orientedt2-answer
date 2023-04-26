package jp.co.sample.answer;

public class Ex01 {
  public static void main(String[] args) {
    
    Ex01Bus bus = new Ex01Bus();

    bus.speed = 10;
    bus.stepOnAccele();

    bus.stepOnBrake();
    bus.stepOnBrake();
  }
}
