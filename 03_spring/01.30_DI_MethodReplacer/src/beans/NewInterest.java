package beans;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class NewInterest implements MethodReplacer{
  @Override
  public Object reimplement(Object obj, Method mtd, Object[] param) throws Throwable {
    System.out.println("NewInterest class for Bank.interest()");
    return obj;
  }
}
