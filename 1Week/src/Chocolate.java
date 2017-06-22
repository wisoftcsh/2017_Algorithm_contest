/**
 * Created by choiseonho on 2017. 6. 22..
 */
public class Chocolate {
  private int k;

  Chocolate() {
  }

  Chocolate(int k) {
    this.k = k;
  }

  private int squareNumber() {
    int n = 0;
    int tmp;
    while (true) {
      tmp = (int) Math.pow(2, n);
      if (k <= tmp) {
        return tmp;
      }
      n++;
    }
  }

  private int cleaveChocolateNumber() {
    Double origin = Math.log(k) / Math.log(2);
    int sub = (int) (Math.log(k) / Math.log(2));
    if (origin - sub == 0) {
      return 0;
    }
    return sub;
  }

  public void printResult() {
    System.out.println(squareNumber());
    System.out.println(cleaveChocolateNumber());
  }
}
