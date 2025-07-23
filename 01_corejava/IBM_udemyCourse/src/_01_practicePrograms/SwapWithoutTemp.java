package _01_practicePrograms;
// Given two integer variables a and b, swap their values in place without using any extra storage.
// Input: a = 35; b = 40;
// Output: a = 40, b = 35

class SwapWithoutTemp {
    public static void main(String[] args) {
        swap(35, 40);
    }

    static void swap(int a, int b) {
        //risk of overflow if a + b exceeds Integer.MAX_VALUE
        // a = a+b;
        // b = a-b;
        // a = a-b;
        // System.out.println("After swap:  a = " + a + ", b = " + b);

        //Bitwise XOR: No overflow but works only on integer types.
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swap:  a = " + a + ", b = " + b);
    }
}