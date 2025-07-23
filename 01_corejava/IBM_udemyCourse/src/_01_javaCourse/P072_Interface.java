package _01_javaCourse;

interface L {
    void p1();

    void p2();
}

interface Q {
    void q1();
}

interface R extends L {
    void r1();
}

class S implements Q, L {
    public void q1() {
        System.out.println("Q1");
    }

    public void r1() {
        System.out.println("R1");
    }

    public void p1() {
        System.out.println("P1");
    }

    public void p2() {
        System.out.println("P2");
    }
}

public class P072_Interface {
    public static void main(String[] args) {
        S s = new S();
        s.p1();
        s.p2();
        s.q1();
        s.r1();
    }
}
