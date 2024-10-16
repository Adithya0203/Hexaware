package vrs.concreteclass;

import vrs.abstractclass.*;

class Car extends Vehicle {
    public Car(String name, int price) {
        super(name,price);
    }

    @Override
    public void rentVehicle() {
        if (!isRented()) {
            System.out.println("Car " + getName() + " rented for ₹" + getPrice());
            setRented(true);
        } else {
            System.out.println("Car " + getName() + " is already rented.");
        }
    }

    @Override
    public void returnVehicle() {
        if (isRented()) {
            System.out.println("Car " + getName() + " returned.");
            setRented(false);
        } else {
            System.out.println("Car " + getName() + " was not rented.");
        }
    }
}