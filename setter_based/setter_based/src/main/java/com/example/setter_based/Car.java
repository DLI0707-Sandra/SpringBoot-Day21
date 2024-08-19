package com.example.setter_based;

public class Car {
    private Engine engine;

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        System.out.println("Car is running with " + engine.getType() + " engine.");
    }
}
