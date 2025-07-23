package _02_javaCourse;

public class P030_ConstructorDemo {

	public static void main(String[] args) {
		
		P030_Car c1 = new P030_Car();
		
		c1.setMake("BMW");
		System.out.println(c1.getMake());
		
		System.out.println(c1.speed);
		System.out.println(c1.gear);
		
		System.out.println("*********************");
		
		P030_Car c2 = new P030_Car(10, 1);
		System.out.println(c2.speed);
		System.out.println(c2.gear);
	}
}