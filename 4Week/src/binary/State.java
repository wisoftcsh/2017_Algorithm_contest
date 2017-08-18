package binary;

public class State {
  public String state(char bit) {
    return bit == '1' ? "10" : "01";
  }

  public String state(String filter){
    return filter.equals("10") ? "1" : "0";
  }
}
