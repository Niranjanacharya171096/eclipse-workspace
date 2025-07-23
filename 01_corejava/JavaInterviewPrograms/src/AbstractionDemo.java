// Define an abstract class Shape with an abstract double area().
// Then create:
// •    Rectangle (fields w, h),
// •    Circle (field r),
// that both implement area(). Finally, write a method printArea(Shape s) that prints the runtime class name and its area.

abstract class Shape {
  abstract double area();
}

class Rectangle extends Shape {
  double w, h;

  public Rectangle(double w, double h) {
    this.w = w;
    this.h = h;
  }

  @Override
  public double area() {
    return w * h;
  }
}

class Circle extends Shape {
  double r;

  public Circle(double r) {
    this.r = r;
  }

  @Override
  public double area() {
    return Math.PI * r * r;
  }
}

class AbstractionDemo {
  public static void main(String[] args) {
    printArea(new Rectangle(3, 4));
    printArea(new Circle(2));
  }

  static void printArea(Shape s) {
    System.out.println(s.getClass().getSimpleName() + " area = " + s.area());
    System.out.printf("%s area = %.2f%n", s.getClass().getSimpleName(), s.area());
  }
}