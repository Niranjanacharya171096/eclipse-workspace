package _02_javaCourse;

public class P251_StaticDemo {

	public static void main(String[] args) {
		P251_StaticExampleClass s1 = new P251_StaticExampleClass("bmw");
		System.out.println("Make of Car is: " + s1.getMake());
		System.out.println("This is intance no: " + P251_StaticExampleClass.getInstanceNum());

		P251_StaticExampleClass s2 = new P251_StaticExampleClass("benz");
		System.out.println("Make of Car is: " + s2.getMake());
		System.out.println("This is intance no: " + P251_StaticExampleClass.getInstanceNum());
	}
}