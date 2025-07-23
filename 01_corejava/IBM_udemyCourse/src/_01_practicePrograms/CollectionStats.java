package _01_practicePrograms;
//Write a method that takes a List<Integer> and returns a Map<String, Integer> containing:
// •	"uniqueCount" → number of unique elements (use a Set),
// •	"max" → maximum value,
// •	"min" → minimum value,
// •	"sum" → sum of all values,
// •	"processedQueueSize" → size after enqueueing all into a LinkedList queue and then dequeueing half of them.

import java.util.*;

class CollectionStats {
    public static void main(String[] args) {
        List<Integer> list = List.of(3,5,3,7,2,7,9);
        System.out.println(computeStats(new ArrayList<>(list)));
    }

    static Map<String, Integer> computeStats(List<Integer> list) {
        Map<String, Integer> stats = new HashMap<>();
        Set<Integer> uniqSet = new HashSet<>(list);
        stats.put("uniqueCount", uniqSet.size());

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, sum = 0;
        System.out.println(min+" "+max);
        for (int num : list) {
            if (num > max) max = num;
            if (num < min) min = num;
            sum += num;
        }
        stats.put("max", max);
        stats.put("min", min);
        stats.put("sum", sum);

        Queue<Integer> que = new LinkedList<>(list);
        for (int i = 0, removeCount = list.size()/2; i < removeCount; i++) {
            que.poll();
        }
        System.out.println(que);

        stats.put("processedQueueSize", que.size());
        return stats;
    }
}