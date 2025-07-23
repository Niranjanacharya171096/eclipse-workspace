package _01_practicePrograms;
// Write a method divide(int a, int b) that:
// •	Throws an IllegalArgumentException with message "Divider must not be zero" if b == 0 (using throw),
// •	Otherwise returns a/b.
// Declare the method with throws IllegalArgumentException, then call it from main inside a try catch 
// to print either the result or the exception message.

class ExceptionDemo {
    public static void main(String[] args) {
        for (int b : new int[]{2, 0}) {
            try {
                System.out.printf("10/%d = %d%n", b, divide(10, b));
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    static int divide(int a, int b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException("Divider must not be zero");
        }
        return a / b;
    }
}