package test;

import java.lang.reflect.Constructor;

//access private class using class.forName()
public class Client {
  public static void main (String [] args) {
    try {
      Class cls = Class.forName("beans.Test");
      Constructor con[] = cls.getDeclaredConstructors();
      con[0].setAccessible(true);
      con[0].newInstance(null);
    } catch(Exception e) {
      System.out.println(e);
    }
  }
}
