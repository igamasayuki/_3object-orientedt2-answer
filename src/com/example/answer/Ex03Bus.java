com.example.answer;

public class Ex03Bus extends Car {
  int price;

  @Override
  void stepOnAccele() {
    super.stepOnAccele();

    price = price + 30;
    System.out.println("料金は"  + price + "円です");
  }
}
