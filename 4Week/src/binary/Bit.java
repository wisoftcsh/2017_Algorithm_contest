package binary;

public class Bit {
  private String bit ="";

  Bit() {
  }

  public void binaryConvert(String input) {
    for (int i = 0; i < input.length(); i++) {
      bit = bit.concat(String.format("%8s", Integer.toBinaryString(input.charAt(i))).replace(' ', '0'));
    }

    bit = new StringBuilder(bit).reverse().toString();
    System.out.println("이진수로 변환");
    System.out.println(bit);
  }

  public String get() {
    return bit;
  }
}
