
class Emp { 
  // static variable salary 
	public static double salary = 200; 
  public static  String name = "Harsh"; 
} 

public class mainclass { 
  public static double salary; 
  public static void main(String args[]) { 
    // accessing static variable without object 
  	salary = 1000; 
    System.out.println(Emp.name + "'s average salary:"+ mainclass.salary);

    Emp e1 = new Emp();
    Emp e2 = new Emp();
    
    Emp.salary = 500; 
    Emp.salary = 900; 
    Emp.name = "Mahesh";
    System.out.println(Emp.name + "'s average salary:"+ Emp.salary);
    
    e1.salary = 1;
    e2.salary = 2;
    System.out.println(e1.salary + " "+ e2.salary);
  } 
}
