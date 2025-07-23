package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

class CollectionStats {
  public static void main(String[] args) {
    List<Integer> list = List.of(3, 5, 3, 7, 2, 7, 9);
    System.out.println("List " + list);
    System.out.println(computeStats(new ArrayList<>(list)));
  }

  static Map<String, Integer> computeStats(List<Integer> list) {
    Map<String, Integer> stats = new HashMap<>();

    Set<Integer> uniqSet = new HashSet<>(list);
    stats.put("uniqueCount", uniqSet.size());

//    store max value in min and min value in max
    int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, sum = 0;
//    System.out.println(min + " " + max);
    for (int num : list) {
      if (num > max)
        max = num;
      if (num < min)
        min = num;
      sum += num;
    }
    stats.put("max", max);
    stats.put("min", min);
    stats.put("sum", sum);

    Queue<Integer> que = new LinkedList<>(list);
    for (int i = 0, removeCount = list.size() / 2; i < removeCount; i++) {
      que.poll();
    }
    System.out.println("Queue " + que);

    stats.put("processedQueueSize", que.size());
    return stats;
  }
}
