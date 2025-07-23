package _01_javaCourse;

class Test {
    public void show() {
        System.out.println("Test");
    }
}

class TestA extends Test {
    @Override
    public void show() {
        System.out.println("Test A");
    }
}

public class P076_Annotation {
    public static void main(String[] args) {
        TestA ta = new TestA();
        ta.show();
    }
}
