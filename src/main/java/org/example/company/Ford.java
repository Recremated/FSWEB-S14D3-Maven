package org.example.company;

public class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    public String startEngine() {
        System.out.println("startEngine() called in " + getClass().getSimpleName());
        return "Ford -> engine starting";
    }

    public String accelerate() {
        System.out.println("accelerate() called in " + getClass().getSimpleName());
        return "Ford -> engine starting";
    }

    public String brake() {
        System.out.println("brake() called in " + getClass().getSimpleName());
        return "Ford -> engine starting";
    }
}
