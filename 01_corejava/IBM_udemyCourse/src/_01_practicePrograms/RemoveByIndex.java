package _01_practicePrograms;
// From a given ArrayList<Integer>, remove the element at a specified index.
// Input List: [71, 82, 21, 33, 9]
// Index to Remove: 3 (0 based)
// Expected Output: [71, 82, 21, 9]

import java.util.*;

class RemoveByIndex {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(71, 82, 21, 33, 9));
        System.out.println(removeAt(list, 3));
    }

    static List<Integer> removeAt(List<Integer> list, int index) {
        if (index < 0 || index >= list.size()) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        list.remove(index);
        return list;
    }
}