package _02_javaCourse;

public class P259_InterfaceDemo implements P259_CarsInterface, P259_BMWCarsInterface {

	@Override
	public void engineStart(String engineType, boolean isKeyLess) {
		System.out.println("This is the implementation");
	}

	@Override
	public void headsUpNavigation() {
		System.out.println("This is the headsup navigation");
	}
}