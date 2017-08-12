import java.util.ArrayList;
import java.util.List;

public class Menchester {
  private List<Integer> filter;
  private Bit bit;

  Menchester() {
  }

  Menchester(Bit bit) {
    this.bit = bit;
    filter = new ArrayList<>();
  }

  public void encoding() {
    for (int data : bit.get()) {
      switch (data) {
        case 0:
          filter.add(0);
          filter.add(1);
          break;
        case 1:
          filter.add(1);
          filter.add(0);
          break;
        default:
          filter.add(-1);
          break;
      }
    }
    bit.get().clear();
    System.out.println("Run encoding");
    System.out.println(filter);
  }

  public void decoding() {
    for (int i = 0; i < filter.size(); i++) {
      if (filter.get(i) == 0 && filter.get(i + 1) == 1) {
        bit.get().add(0);
        i++;
      } else if (filter.get(i) == 1 && filter.get(i + 1) == 0) {
        bit.get().add(1);
        i++;
      } else {
        bit.get().add(-1);
      }
    }
    System.out.println("Run decoding");
    System.out.println(bit.get());
  }

  public void getString() {
    StringBuilder input = new StringBuilder();
    int ascii = 0;
    int index = 0;

    for (int binary : bit.get()) {
      switch (binary) {
        case 1:
          ascii += Math.pow(2, index);
          index++;
          break;
        case -1:
          input.append(Character.toString((char) ascii));
          index = 0;
          ascii = 0;
          break;
        default:
          index++;
          break;
      }
    }

    System.out.println("Input String : " +input);
  }
}
