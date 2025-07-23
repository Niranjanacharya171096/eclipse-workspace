package _02_javaCourse;

public class P256_BMW extends P256_Cars {

	public P256_BMW(int startSpeed) {
		super(startSpeed);
	}

	@Override
	public void increaseSpeed() {
		protectedSpeed++;
		P256_Cars c1 = new P256_Cars();
		c1.decreaseSpeed();
		System.out.println("Increasing Speed of P256_BMW");
	}

	public void headupDisplayNavigation() {
		System.out.println("P256_BMW Specific Functionality");
	}

	public void stop() {
		P256_Cars c1 = new P256_Cars();
		c1.decreaseSpeed();
	}
}
