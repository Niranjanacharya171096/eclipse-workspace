package _01_javaCourse;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class P105_ParallelStream {
  public static void main(String[] args) {
    int size = 10_000;
    List<Integer> nums = new ArrayList<>();
    Random random = new Random();
    for (int i = 1; i <= size; i++) {
      nums.add(random.nextInt(i));
    }
    // System.out.println(nums);
    int sum1 = nums.stream().map(i -> i * 2).reduce(0, (c, e) -> c + e);

    System.out.println(sum1);
//or
    long startSeq = System.currentTimeMillis();
    int sum2 = nums.stream().map(i -> i * 2).mapToInt(i -> i).sum();
    long endSeq = System.currentTimeMillis();
    System.out.println(sum2);
//or
    long startPara = System.currentTimeMillis();
    int sum3 = nums.parallelStream() // used to handle filter with thread
        .map(i -> i * 2).mapToInt(i -> i).sum();
    long endPara = System.currentTimeMillis();
    System.out.println(sum3);

    System.out.println("Seq :: " + (endSeq - startSeq));
    System.out.println("Para :: " + (endPara - startPara));

    int sum4 = nums.parallelStream() // used to handle filter with thread
        .filter(num -> num % 2 == 0) // we can put condition in Predicate(I) and pass reference
        .map(num -> num * 2) // we can put opetion in Function(I) and pass reference
        .reduce(0, (carry, element) -> carry + element);

    System.out.println(sum4);

  }
}
