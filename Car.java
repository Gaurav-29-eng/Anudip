public class Car {
    String make;
    String model;
    short year;
    int price;

    public Car(String make, String model, short year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public void displayCar() {
        System.out.println("Car: " + make + " " + model + " (" + year + "), Price: ₹" + price);
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", (short)2021, 2500000);
        Car car2 = new Car("Honda", "Civic", (short)2022, 2200000);
        
        car1.displayCar();
        car2.displayCar();
    }
}
