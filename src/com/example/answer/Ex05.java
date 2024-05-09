com.example.answer;

public class Ex05 {
  public static void main(String[] args) {
    
    Ex05Car car = new Ex05Car();
    car.setSpeed(30);
    car.setName("エスティマ");

    System.out.println("現在のスピード:" + car.getSpeed());
    System.out.println("名前:" + car.getName());
  }
}
