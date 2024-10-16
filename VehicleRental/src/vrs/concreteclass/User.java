package vrs.concreteclass;
import vrs.abstractclass.*;

class User {
    private String userName;
    private Vehicle rentedVehicle;

    public User(String userName) {
        this.userName = userName;
        this.rentedVehicle = null;
    }

    public void rentVehicle(Vehicle vehicle) {
        if (rentedVehicle == null) {
            vehicle.rentVehicle();
            rentedVehicle = vehicle;
        } else {
            System.out.println(userName + " already rented a vehicle: " + rentedVehicle.getName());
        }
    }

    public void returnVehicle() {
        if (rentedVehicle != null) {
            rentedVehicle.returnVehicle();
            rentedVehicle = null;
        } else {
            System.out.println(userName + " has no rented vehicle to return.");
        }
    }

    public Vehicle getRentedVehicle() {
        return rentedVehicle;
    }
}