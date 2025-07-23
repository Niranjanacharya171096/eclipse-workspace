package _02_javaCourse;

public class P251_StaticExampleClass {
	private static int wheelsCount = 4;
	private String make;
	private static int instanceNum = 0;

	public P251_StaticExampleClass(String make) {
		this.make = make;
		instanceNum++;
	}

	public String getMake() {
		return make;
	}

	public static int getInstanceNum() {
		return instanceNum;
	}

}