import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by choiseonho on 2017. 7. 3..
 */
public class Temperature {
  private List<Integer> temperatureList = new ArrayList<>();
  private int k;
  private int totalMidValue = 0;

  Temperature() {
  }

  Temperature(int k) {
    this.k = k;
    this.temperatureList.add(null);
  }

  private void sum() {
    int loop = (temperatureList.size()-1)-k+1; // n = temperatureList.size()-1
    int start = 1;
    int last = k+1;
    while(loop > 0){
      totalMidValue += findMidValue(start++, last++);
      loop--;
    }
  }

  private int findMidValue(int start, int last) {
    int midValue;
    List<Integer> subArray = new ArrayList<>(temperatureList.subList(start, last));
    Collections.sort(subArray);
    midValue = subArray.get(subArray.size()/2);
    return midValue;
  }

  public void addTemperature(int temp) {
    temperatureList.add(temp);
  }

  public void sumMidValue() {
    sum();
  }

  public void printList() {
    System.out.println(temperatureList);
  }

  public void printTotalValue() {
    System.out.println(totalMidValue);
  }
}
