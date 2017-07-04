import java.util.Random;
import java.util.Scanner;

/**
 * Created by choiseonho on 2017. 7. 3..
 */
public class Test {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int k, n;

    n = scanner.nextInt();
    if(n < 1 || n > 250000){
      System.out.println("n은 1~250000");
      n = scanner.nextInt();
    }

    k = scanner.nextInt();
    if(k < 1 || k > 5000 || k > n){
      System.out.println("k는 1~5000, k는 n보다 작거나 같아야함");
      k = scanner.nextInt();
    }

    Temperature temperature = new Temperature(k);

    while(n > 0){
//      temperature.addTemperature(random.nextInt(65536)); // 요구 사항
      temperature.addTemperature(random.nextInt(20)); // 테스트용
      n--;
    }

    temperature.printList();
    long start = System.currentTimeMillis();
    temperature.sumMidValue();
    long end = System.currentTimeMillis();
    System.out.println( "실행 시간 : " + ( end - start )/1000.0 );
    temperature.printTotalValue();
  }
}
