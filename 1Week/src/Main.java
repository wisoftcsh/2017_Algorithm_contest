import java.util.Scanner;

/**
 * Created by choiseonho on 2017. 6. 22..
 */
public class Main {
  public static void main(String[] args) {
    int k = 0;
    Chocolate chocolate;
    Scanner scanner = new Scanner(System.in);

    while(k != -1) { // -1 : Exit
      k = scanner.nextInt();
      if (1 <= k && k <= 1000000) {
        chocolate = new Chocolate(k);
        chocolate.printResult();
      } else {
        System.out.println("Fail : K의 범위는 1 ~ 1,000,000");
      }
    }
  }
}
