package _01_javaCourse;

import java.util.Scanner;

public class P089_TryWithResources {
    public static void main(String[] args) {
        int num = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            num = scanner.nextInt();
            System.out.println(num);
        } 
        //catch(Exception e) {}
        // finally { //it runs though irrespective of Exception
        // for closing the resources
        //     scanner.close();
        // }
    }
}
