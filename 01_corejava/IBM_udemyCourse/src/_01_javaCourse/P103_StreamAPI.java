package _01_javaCourse;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class P103_StreamAPI {
  public static void main(String[] args) {
    List<Integer> nums1 = Arrays.asList(33, 17, 62, 51, 24);
    // we can perform below action using Stream in one line
    // int sum = 0;
    // for(int num : nums1) {
    // if(num%2 == 0) {
    // num = num * 2;
    // sum += num;
    // }
    // }
    // System.out.println(sum);

    Stream<Integer> stream1 = nums1.stream();
    // stream1.forEach(num -> System.out.println(num));
    // cant use stream once it is used, throws IllegalStateException
    // stream1.forEach(num -> System.out.println(num));
    // create new stream

    Stream<Integer> stream2 = stream1.filter(num -> num % 2 == 0);
    Stream<Integer> stream3 = stream2.map(num -> num * 2);
    int result = stream3.reduce(0, (carry, element) -> carry + element);
    System.out.println(result);

    // reduce above to below code
    int sum = nums1.stream().filter(num -> num % 2 == 0).map(num -> num * 2).reduce(0,
        (carry, element) -> carry + element);

    System.out.println(sum);
  }
}
