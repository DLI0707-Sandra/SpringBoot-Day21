package com.example.constructor_based;

public class Car {
    private Engine engine;

    // Constructor for dependency injection
    public Car(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        engine.start();
        System.out.println("Car is driving...");
    }
}
