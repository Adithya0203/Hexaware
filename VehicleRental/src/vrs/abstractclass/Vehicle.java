package vrs.abstractclass;
import vrs.mainprogram.*;

public abstract class Vehicle implements Rentable{
	private String  name;
	private int price;
	private boolean isRented;
	
	public Vehicle(String name, int price) {
//		super();
		this.name = name;
		this.price = price;
		this.isRented = false;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public boolean isRented() {
		return isRented;
	}

	public void setRented(boolean isRented) {
		this.isRented = isRented;
	}
	
	@Override
	public abstract void rentVehicle();
	
	@Override
	public abstract void returnVehicle();
	
}