package beans;

import java.util.*;

public class Test {
  private Vector fruits;
  private TreeSet cricketers;
  private Hashtable countrycap;

  Test(){
    System.out.println("Test....");
  }

  public Vector getFruits() {
    return fruits;
  }

  public void setFruits(Vector fruits) {
    this.fruits = fruits;
  }

  public TreeSet getCricketers() {
    return cricketers;
  }

  public void setCricketers(TreeSet cricketers) {
    this.cricketers = cricketers;
  }

  public Hashtable getCountrycap() {
    return countrycap;
  }

  public void setCountrycap(Hashtable countrycap) {
    this.countrycap = countrycap;
  }

  public void printData() {
    System.out.println("Fruits....: ");
    for(Object fruit:fruits)
      System.out.println(fruit);
    
    System.out.println("\nCricketers....: ");
    for(Object cricketer:cricketers)
      System.out.println(cricketer);
    
    System.out.println("\nCountries and Capitals....: ");
    Set keys = countrycap.keySet();
    for(Object key:keys)
      System.out.println(key + " - " + countrycap.get(key));
  }
}
