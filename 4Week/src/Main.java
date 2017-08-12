public class Main {
  public static void main(String[] args) {
    Bit bit = new Bit();
    bit.binaryConvert("ABC");

    Menchester menchester = new Menchester(bit);
    menchester.encoding();
    menchester.decoding();
    menchester.getString();
  }
}
