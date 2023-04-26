package jp.co.sample.answer;

public class Ex06PC implements Electrical{
  
  private boolean powerOn;

  @Override
  public void power()  {
    if(powerOn){
      powerOn = false;
      System.out.println("PCの電源が切れました");
    } else {
      System.out.println("設定ファイルを読み込んでいます");
      // 3秒間止める(検査例外が発生するため例外処理必須)
      try {
        Thread.sleep(3000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

      powerOn = true;
      System.out.println("PCの電源が入りました");
    }
  }


  public boolean isPowerOn() {
    return this.powerOn;
  }

  public void setPowerOn(boolean powerOn) {
    this.powerOn = powerOn;
  }

}
