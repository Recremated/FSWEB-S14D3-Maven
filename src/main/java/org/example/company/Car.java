package org.example.company;

import java.util.Objects;

public class Car {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders,String name){
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public String startEngine() {
        System.out.println("startEngine() called in " + getClass().getSimpleName());
        return "the car's engine is starting";
    }

    public String accelerate() {
        System.out.println("accelerate() called in " + getClass().getSimpleName());
        return "the car is accelerating";
    }

    public String brake() {
        System.out.println("brake() called in " + getClass().getSimpleName());
        return "the car is braking";
    }




    @Override
    public String toString() {
        return "Car {" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Car car = (Car) obj;
        return cylinders == car.cylinders &&
                (Objects.equals(name, car.name));
    }


}
