package vrs.concreteclass;

import vrs.abstractclass.*;

class Bike extends Vehicle {
    public Bike(String name, int price) {
        super(name,price);
    }

    @Override
    public void rentVehicle() {
        if (!isRented()) {
            System.out.println("Bike " + getName() + " rented for ₹" + getPrice());
            setRented(true);
        } else {
            System.out.println("Bike " + getName() + " is already rented.");
        }
    }

    @Override
    public void returnVehicle() {
        if (isRented()) {
            System.out.println("Bike " + getName() + " returned.");
            setRented(false);
        } else {
            System.out.println("Bike " + getName() + " was not rented.");
        }
    }
}