public class Polymorphism {

  public static void main(String[] args) {
    Car myCar = new Car("Toyota", "Camry", 4);
    myCar.start();
    myCar.stop();
  }
}

class Vehicle {

  private String brand;

  public String getBrand() {
    return brand;
  }

  private String model;

  public String getModel() {
    return model;
  }

  Vehicle(String brand, String model) {
    this.brand = brand;
    this.model = model;
  }

  public void start() {
    System.out.println("The vehicle starts.");
  }

  public void stop() {
    System.out.println("The vehicle stops.");
  }
}

class Car extends Vehicle {

  private int numberOfDoors;

  public int getNumberOfDoors() {
    return numberOfDoors;
  }

  Car(String brand, String model, int numberOfDoors) {
    super(brand, model);
    this.numberOfDoors = numberOfDoors;
    System.out.println("Car: " + brand + " " + model + " " + numberOfDoors);
  }

  @Override
  public void start() {
    super.start();
    System.out.println("The car starts.");
  }
}
