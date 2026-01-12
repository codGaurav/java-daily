package day08_advanced_oop;

// Abstract class - when you have common implementation
abstract class Vehicle {
    
    String brand;
    int year;
    
    // Constructor
    Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
    
    // Abstract method
    abstract void start();
    
    // Concrete method - common to all vehicles
    void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

// Interface - for capabilities/behaviors
interface Electric {
    void chargeBattery();
    int getBatteryLevel();
}

interface GPS {
    void showLocation();
}

// Regular car - only extends Vehicle
class Car extends Vehicle {
    
    Car(String brand, int year) {
        super(brand, year);
    }
    
    @Override
    void start() {
        System.out.println("Car engine starts: Vroom!");
    }
}

// Tesla - extends Vehicle AND implements Electric, GPS
class Tesla extends Vehicle implements Electric, GPS {
    
    private int batteryLevel;
    
    Tesla(String brand, int year) {
        super(brand, year);
        this.batteryLevel = 100;
    }
    
    @Override
    void start() {
        System.out.println("Tesla silently starts (electric)");
    }
    
    @Override
    public void chargeBattery() {
        batteryLevel = 100;
        System.out.println("Battery fully charged!");
    }
    
    @Override
    public int getBatteryLevel() {
        return batteryLevel;
    }
    
    @Override
    public void showLocation() {
        System.out.println("GPS: You are at location XYZ");
    }
}

public class InterfaceVsAbstractClass {
    public static void main(String[] args) {
        
        System.out.println("=== Regular Car ===");
        Car car = new Car("Honda", 2020);
        car.displayInfo();
        car.start();
        
        System.out.println("\n=== Tesla (Electric Car) ===");
        Tesla tesla = new Tesla("Tesla", 2023);
        tesla.displayInfo();
        tesla.start();
        System.out.println("Battery: " + tesla.getBatteryLevel() + "%");
        tesla.showLocation();
        
        // Polymorphism with interface
        System.out.println("\n=== Using Interface Reference ===");
        Electric electric = new Tesla("Tesla", 2024);
        electric.chargeBattery();
        System.out.println("Battery: " + electric.getBatteryLevel() + "%");
    }
}