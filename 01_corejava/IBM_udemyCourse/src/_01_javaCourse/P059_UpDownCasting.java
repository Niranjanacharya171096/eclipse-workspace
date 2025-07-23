package _01_javaCourse;

class A {
    public void show1() {
        System.out.println("A show");
    }
}

class B extends A {
    public void show2() {
        System.out.println("B show");
    }

}

class P059_UpDownCasting {
    public static void main(String[] args) {
        A a =  new B();
        a.show1();

        B b = (B) a;
        b.show1();
        b.show2();
    }
}
