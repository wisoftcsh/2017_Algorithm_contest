package array;

public class Main {
  public static void main(String[] args) {
    Bit bit = new Bit();
    bit.binaryConvert("ABC abc DEFG 1234 !@");

    Manchester manchester = new Manchester(bit);
    manchester.encoding();
    manchester.decoding();
    manchester.getString();

//  value == manchester.decoding(manchester.encoding(value)); -> True
  }
}
