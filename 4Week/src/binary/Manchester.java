package binary;

public class Manchester extends State {

  Manchester() {
  }

  public String encoding(String bit) {
    String filter = "";
    for (int i = 0; i < bit.length(); i++) {
      filter = filter.concat(state(bit.charAt(i)));
    }
    System.out.println("Run encoding");
    System.out.println(filter);
    return filter;
  }

  public String decoding(String filter) {
    String origin = "";
    for (int i = 0; i < filter.length(); i += 2) {
      origin = origin.concat(state(String.valueOf(filter.charAt(i)).concat(String.valueOf(filter.charAt(i + 1)))));
    }
    System.out.println("Run decoding");
    System.out.println(origin);
    return origin;
  }

  public void getString(String bit) {
    StringBuilder input = new StringBuilder();
    int ascii = 0;
    int index = 0;

    for (int i = 0; i < bit.length(); i++) {
      if (bit.charAt(i) == '1') {
        ascii += Math.pow(2, index);
      }
      index++;

      if (index == 8) {
        input.append(Character.toString((char) ascii));
        ascii = 0;
        index = 0;
      }
    }
    input.reverse();
    System.out.println("Input String : " + input);
  }
}
