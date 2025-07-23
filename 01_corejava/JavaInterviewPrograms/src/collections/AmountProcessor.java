package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AmountProcessor {
  public static void main(String[] args) {
    List<String> amounts = Arrays.asList("?655", "?1200", "?340", "?655", "?999");

    Map<String, Double> result = processAmounts(amounts);
    System.out.println("Result Map: " + result);
  }

  public static Map<String, Double> processAmounts(List<String> amountList) {
    List<Integer> numericAmounts = new ArrayList<>();

    // Remove ? and convert to integer
    for (String amount : amountList) {
      String numeric = amount.replace("?", "").trim();
      System.out.println(numeric);
      numericAmounts.add(Integer.parseInt(numeric));
    }

    // Calculate min, max, average
    int min = Collections.min(numericAmounts);
    int max = Collections.max(numericAmounts);

    // double avg =
    // numericAmounts.stream().mapToInt(Integer::intValue).average().orElse(0);
    int sum = 0;
    for (int num : numericAmounts) {
      sum += num;
    }
    double avg = numericAmounts.isEmpty() ? 0 : (double) sum / numericAmounts.size();

    // Store in Map
    Map<String, Double> resultMap = new HashMap<>();
    resultMap.put("min", (double) min);
    resultMap.put("max", (double) max);
    resultMap.put("average", avg);

    return resultMap;
  }
}
