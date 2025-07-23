package _02_javaCourse;

public class P256_InheritanceDemo {

	public static void main(String[] args) {
		int speed = 10;

		P256_Cars c1 = new P256_Cars(speed);
		c1.increaseSpeed();
		c1.publicSpeed = 10;

		P256_BMW bmw1 = new P256_BMW(speed);
		bmw1.increaseSpeed();
		bmw1.headupDisplayNavigation();
	}

}
