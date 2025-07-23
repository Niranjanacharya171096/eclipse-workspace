package strings;

class PrintFromLastDigit {
  public static void main(String[] args) {
    String num = "56789";
    A a = new A();
    a.method1(num);
  }
}

class A {
  public void method1(String num) {
    int length = num.length();

    for (int i = length - 1; i >= 0; i--) {
      for (int j = i; j < length; j++) {
        System.out.print(num.charAt(j));
      }
      System.out.println();
    }
  }
}
