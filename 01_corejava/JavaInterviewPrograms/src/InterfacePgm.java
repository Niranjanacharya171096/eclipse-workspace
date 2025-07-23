interface I {
  int x = 20; // public static final

  void m1(); // public and abstract

  void m2(); // public and abstract

  void m3(); // public and abstract
}

class A implements I {
  public void m1() {
    System.out.println("m1-A");
  }

  public void m2() {
    System.out.println("m2-A");
  }

  public void m3() {
    System.out.println("m3-A");
  }

  public void m4() {
    System.out.println("m4-A");
  }
}

class InterfacePgm {
  public static void main(String[] args) {
//I i=new I();---> i is an object //Error 
    I i = new A();// i is a reference
    System.out.println(I.x);
    System.out.println(i.x);
    i.m1();
    i.m2();
    i.m3();
//i.m4();//----> Error 
    A a = new A();
    System.out.println(a.x);
    System.out.println(A.x);
    a.m1();
    a.m2();
    a.m3();
    a.m4();
    ((A) i).m4(); // Since i actually refers to an object of type A, you can downcast it to A to
                  // access m4().
  }
}
