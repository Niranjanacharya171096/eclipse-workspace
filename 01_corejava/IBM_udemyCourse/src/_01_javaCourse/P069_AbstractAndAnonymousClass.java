package _01_javaCourse;

abstract class Home {
    public abstract void show();

    public void color() {
        System.out.println("Home2 color");
    }
}

public class P069_AbstractAndAnonymousClass {
    public static void main(String[] args) {
        Home a = new Home() {
            public void show() {
                System.out.println("Home Show");
            }

            public void color() {
                System.out.println("Home color");
            }
        };
        a.show();
        a.color();
    }
}
