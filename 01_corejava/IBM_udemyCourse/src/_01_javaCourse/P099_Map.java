package _01_javaCourse;

import java.util.*;

public class P099_Map {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();        
        // map.put("9"); //if we use Generics <>, throws Compile time error and avoids RunTimeException
        map.put("naveen", 17);
        map.put("ramesh",5);
        map.put(null,10); //can have single null key
        map.put("sayeed",6);
        map.put("rakesh",5); //Duplication not allowed
        map.put("sayeed",118);

        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());
        for(Map.Entry<String, Integer> num : map.entrySet()) { //Collection(I) doesn't support Indexing
            System.out.println(num);
        }
    }
}