package _01_practicePrograms;
// Define an abstract class Shape with an abstract double area(). 
// Then create:
// •	Rectangle (fields width, height),
// •	Circle (field radius),
// that both implement area(). Finally, write a method printArea(Shape shape) that prints the runtime class name and its area.

abstract class Shape {
    abstract double area();
}

class Rectangle extends Shape {
    double width, height;

    public Rectangle (double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width*height;
    }
}

class Circle extends Shape {
    double radius;
    public Circle (double radius) {
        this.radius = radius;
    }
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class AbstractionDemo {
    public static void main(String[] args) {
        printArea(new Rectangle(3, 4));
        printArea(new Circle(2));
    }

    static void printArea(Shape shape) {
        System.out.println(shape.getClass().getSimpleName()+" area = "+ shape.area());
        System.out.printf("%shape area = %.2f%n", shape.getClass().getSimpleName(), shape.area());
    }
}