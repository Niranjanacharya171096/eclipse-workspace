package _01_javaCourse;

@FunctionalInterface
interface funcInterfc1 {
  void show();
}

@FunctionalInterface // only one method and Lambda exp only for Functional interface
interface funcInterfc2 {
  void show(int i);
}

@FunctionalInterface // only one method and Lambda exp only for Functional interface
interface funcInterfc3 {
  void show(int i, int j);
}

public class P079_LambdaExpression {
  public static void main(String[] args) {
    funcInterfc fi = () -> System.out.println("I show"); // Lambda Exp
    fi.show();

    funcInterfc2 fi2 = i -> System.out.println("show = " + i); // Lambda Exp
    // new funcInterfc1() { public void show(int i)
    // { //as only one statement
    // };
    fi2.show(5);

    funcInterfc3 fi3 = (i, j) -> System.out.println("show = " + i + " " + j); // Lambda Exp
    fi3.show(6, 8);
  }
}
