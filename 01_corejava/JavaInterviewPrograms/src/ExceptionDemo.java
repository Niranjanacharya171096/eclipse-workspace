class ExceptionDemo {
  public static void main(String[] args) {
    for (int b : new int[] { 2, 0 }) {
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
