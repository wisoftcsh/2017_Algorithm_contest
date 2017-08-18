package array;

import java.util.ArrayList;
import java.util.List;

public class Bit {
  private List<Integer> bit = new ArrayList<>();

  Bit() {
  }

  public void binaryConvert(String input) { // 실제 비트를 사용할 것, 비트 연산을 사용하는 게 좋다
    List<Integer> asciiArray = new ArrayList<>();
    for (int i = 0; i < input.length(); i++) {
      asciiArray.add((int) input.charAt(i));
    }

    for (int ascii : asciiArray) {
      System.out.println("Ascii Code : " + ascii);
      while (ascii > 0) {
        bit.add(ascii % 2);
        ascii /= 2;
      }
      bit.add(-1);
    }

    System.out.println("이진수로 변환");
    System.out.println(bit);
  }

  public List<Integer> get() {
    return bit;
  }
}
