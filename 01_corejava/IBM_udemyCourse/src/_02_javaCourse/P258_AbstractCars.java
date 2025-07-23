package _02_javaCourse;

public abstract class P258_AbstractCars {

	private int privateSpeed;
	public int publicSpeed;

	protected int protectedSpeed;

	int speedLimit = 100;

	public P258_AbstractCars() {
		this(0);
	}

	public P258_AbstractCars(int startSpeed) {
		this.privateSpeed = startSpeed;
	}

	public void setPrivateSpeed(int pSpeed) {
		this.privateSpeed = pSpeed;
	}

	public abstract void engineStart(String keyType, int numOfCyl);
}