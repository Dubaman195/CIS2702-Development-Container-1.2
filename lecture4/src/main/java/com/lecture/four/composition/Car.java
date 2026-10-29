package com.lecture.four.composition;

public  class Car {
    private String brand;
    private Engine engine; // Composition Example
    private Transmission transmission; // Composition Example
    
    // Car creates and owns its components
    public Car(String brand, int horsepower, String transmissionType) {
        this.brand = brand;
        // Creating components inside - strong ownership
        this.engine = new Engine(horsepower, "V6");
        this.transmission = new Transmission(transmissionType, 6);
        System.out.println(brand + " car assembled");
    }
    
    public void start() {
        System.out.println("Starting " + brand);
        engine.start();
    }
    
    public void drive() {
        System.out.println(brand + " is driving");
        transmission.shiftGear(3);
    }
    
    public void stop() {
        engine.stop();
        System.out.println(brand + " stopped");
    }
    
    public String getBrand() {
        return brand;
    }
    

    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 200, "Automatic");
        myCar.start();
        myCar.drive();
        myCar.stop();
        
        System.out.println();
        
        // When myCar goes out of scope, engine and transmission are destroyed too
        myCar = null;
        System.gc(); // Suggest garbage collection
        
        System.out.println("Car object destroyed along with its components");
    }
    
}
