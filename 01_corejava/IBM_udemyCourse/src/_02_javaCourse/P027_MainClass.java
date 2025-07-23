package _02_javaCourse;

public class P027_MainClass {

	public static void main(String[] args) {
		P026_Car car = new P026_Car();
		car.increaseSpeed();
		car.setColor("blue");
		System.out.println(car.getColor());
	}
}
