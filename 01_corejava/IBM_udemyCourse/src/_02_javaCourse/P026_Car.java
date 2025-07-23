package _02_javaCourse;

public class P026_Car {
	// color
	private String color;
	// make
	private String make;
	// model
	private String model;
	// year
	private int year;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void increaseSpeed() {
		System.out.println("Increasing the speed");
	}
}

