package jp.co.sample.sample.chapter3;

public interface Electrical2 {
  
  // インターフェースは定数の定義は可能です
  int FULL_CHARGE_VALUE = 100; // 満充電の値(これ以上は充電できなくするという値)
  // 以下と同じになります
  // public static final int FULL_CHARGE_VALUE = 100;

  // 電源をON/OFFする
  public void power();

  // コンセントを指す(各製品の共通処理)
  public default void plugin(){
    System.out.println("コンセントをさしました");
  }

  // 満充電の値を出力(インスタンス化しなくても使える処理)
  public static void showFullChargeValue(){
    System.out.println("この製品は" + FULL_CHARGE_VALUE + "まで充電できます");
  }
}
