package _01_javaCourse;

class X {
  public void xshow() {
    System.out.println("X show");
  }

  class Y {
    public void yshow() {
      System.out.println("Y show");
    }
  }

  static class Z {
    public void zshow() {
      System.out.println("Z show");
    }
  }

}

public class P067_InnerClasses {
  public static void main(String[] args) {
    X x = new X();
    x.xshow();

    X.Y y = x.new Y();
    y.yshow();

    X.Z z = new X.Z();
    z.zshow();

  }
}
