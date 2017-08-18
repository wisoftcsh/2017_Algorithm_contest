package binary;

public class Main {
  public static void main(String[] args) {
    Bit bit = new Bit();
    bit.binaryConvert("ABC abc DEFG 1234 !@");

    Manchester manchester = new Manchester();
    manchester.getString(manchester.decoding((manchester.encoding(bit.get()))));
  }
}
