package _02_javaCourse;

public class P257_AccessModifiersDemo {

	public static void main(String[] args) {
		P257_Cars c1 = new P257_Cars();
		c1.increaseSpeed();
		c1.speed = 10;
		c1.setPrivateSpeed(10);
		c1.publicSpeed = 100;
		c1.protectedSpeed = 100;
		c1.decreaseSpeed();
	}
}
