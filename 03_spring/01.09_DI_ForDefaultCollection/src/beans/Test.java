package beans;

import java.util.*;

public class Test {
  private List fruits; // Default List is ArrayList
  private Set cricketers; // Default Set is LinkedHashSet
  private Map countrycap; // Default Map is LinkedHashMap

  Test(){
    System.out.println("Test....");
  }
  
//  public List getFruits() {
//    return fruits;
//  }

  public void setFruits(List fruits) {
    this.fruits = fruits;
  }

//  public Set getCricketers() {
//    return cricketers;
//  }

  public void setCricketers(Set cricketers) {
    this.cricketers = cricketers;
  }

//  public Map getCountrycap() {
//    return countrycap;
//  }

  public void setCountrycap(Map countrycap) {
    this.countrycap = countrycap;
  }

  public void printData() {
    System.out.println("List of Fruits....: ");
    for(Object fruit:fruits)
      System.out.println(fruit);
    
    System.out.println("\nSet of Cricketers....: ");
    for(Object cricketer:cricketers)
      System.out.println(cricketer);
    
    System.out.println("\nMap of Countries and Capitals....: ");
    Set keys = countrycap.keySet();
    for(Object key:keys)
      System.out.println(key + " - " + countrycap.get(key));
  }
}
