package _01_javaCourse;

interface Area {
    int l = 10; // final static

    void area(); // public abstract

    void config();
}

class Square implements Area {
    public void area() {
        System.out.println("area ="+ l);
    }

    public void config() {
        System.out.println("config");
    }

}

public class P071_Interface {
    public static void main(String[] args) {
        Area a = new Square();
        a.area();
        System.out.println(Area.l);
    }
}
