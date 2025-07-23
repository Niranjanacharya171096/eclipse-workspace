package _01_practicePrograms;
// Benchmark basic operations—add(E), get(i), and remove(0)—on both ArrayList and LinkedList for 100,000 integer elements. 
// Report the time (ms) taken by each operation on each structure.

import java.util.*;

public class ListBenchmark {
    public static void main(String[] args) {
        int n = 100_000;
        // System.out.println(n);
        
        List<Integer> al = new ArrayList<>();
        List<Integer> ll = new LinkedList<>();
        
        // Benchmark add
        long t1 = System.nanoTime();
        for (int i = 0; i < n; i++) al.add(i);
        long t2 = System.nanoTime();
        for (int i = 0; i < n; i++) ll.add(i);
        long t3 = System.nanoTime();

        // Benchmark get
        long t4 = System.nanoTime();
        for (int i = 0; i < n; i++) al.get(i);
        long t5 = System.nanoTime();
        for (int i = 0; i < n; i++) ll.get(i);
        long t6 = System.nanoTime();

        // Benchmark remove(0)
        long t7 = System.nanoTime();
        for (int i = 0; i < n/10; i++) al.remove(0);
        long t8 = System.nanoTime();
        for (int i = 0; i < n/10; i++) ll.remove(0);
        long t9 = System.nanoTime();

        System.out.printf("Operation      ArrayList(ms)  LinkedList(ms)%n");
        System.out.printf("add            %8d       %8d%n", (t2-t1)/1_000_000, (t3-t2)/1_000_000);
        System.out.printf("get            %8d       %8d%n", (t5-t4)/1_000_000, (t6-t5)/1_000_000);
        System.out.printf("remove(0)x10%%  %8d       %8d%n", (t8-t7)/1_000_000, (t9-t8)/1_000_000);
    }
}
