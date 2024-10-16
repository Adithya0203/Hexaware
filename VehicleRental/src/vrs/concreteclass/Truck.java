package vrs.concreteclass;

import vrs.abstractclass.*;

class Truck extends Vehicle {
    public Truck(String name, int price) {
        super(name,price);
    }

    @Override
    public void rentVehicle() {
        if (!isRented()) {
            System.out.println("Truck " + getName() + " rented for ₹" + getPrice());
            setRented(true);
        } else {
            System.out.println("Truck " + getName() + " is already rented.");
        }
    }

    @Override
    public void returnVehicle() {
        if (isRented()) {
            System.out.println("Truck " + getName() + " returned.");
            setRented(false);
        } else {
            System.out.println("Truck " + getName() + " was not rented.");
        }
    }
}