
public class Test{
  public static synchronized void main(String[] args) throws InterruptedException
  {
  Thread cs=new Thread();
  cs.start();
  System.out.print("A");
  cs.wait(1000);
  System.out.print("B");
}}