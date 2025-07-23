package _02_javaCourse;

public class P252_StaticKeynotesDemo {

	// Static method cannot use the non-static variable or method directly
	// This and super cannot be used in static context

	public int addNum = 10;
	public static int addNumStatic = 10;

	public static void main(String[] args) {
		P252_StaticKeynotesDemo s1 = new P252_StaticKeynotesDemo();
		int output = s1.sum(20);
		int staticOutput = sumStatic(10);
		System.out.println("The output is: " + output);
		System.out.println("The output is: " + staticOutput);
	}

	public int sum(int num) {
		return num + addNum;
	}

	public static int sumStatic(int num) {
		return num + addNumStatic;
	}
}