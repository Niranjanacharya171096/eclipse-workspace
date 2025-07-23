/* Create a class hierarchy: Vehicle > Car > ElectricCar.
•   Vehicle has String model and int year.
•   Car adds int mileage.
•   ElectricCar adds int batteryCapacity.
Write constructors that chain via super(...), then print full details for an ElectricCar instance.
*/

class Vehicle {
  String model;
  int year;

  public Vehicle(String model, int year) {
    this.model = model;
    this.year = year;
  }

  @Override
  public String toString() {
    System.out.println(1);
    return "Vehicle[model=" + model + ", year=" + year;
    // return "Vehicle[model=" + model + ", year=" + year + "]";
  }
}

class Car extends Vehicle {
  int mileage;

  public Car(String model, int year, int mileage) {
    super(model, year); // call to super must be first statement in constructor
    this.mileage = mileage;
  }

  @Override
  public String toString() {
    System.out.println(2);
    return super.toString().concat(", mileage=" + mileage);
    // return super.toString().replace("]", ", mileage=" + mileage + "]");
  }
}

class ElectricCar extends Car {
  int batteryCapacity;

  public ElectricCar(String model, int year, int mileage, int batteryCapacity) {
    super(model, year, mileage); // call to super must be first statement in constructor
    this.batteryCapacity = batteryCapacity;
  }

  @Override
  public String toString() {
    System.out.println(3);
    return super.toString().concat(", batteryCapacity=" + batteryCapacity + "]");
    // return super.toString().replace("]", ", batteryCapacity=" + batteryCapacity +
    // "]");
  }
}

class InheritanceDemo {
  public static void main(String[] args) {
    System.out.println(new ElectricCar("Tesla Model S", 2022, 15000, 100));
  }
}
