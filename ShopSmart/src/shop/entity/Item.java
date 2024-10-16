package shop.entity;

import shop.exception.*;

public class Item {
	private String itemName;
	private double price;
	private String category;
	
	public Item(String itemName, double price, String category) throws InvalidPriceException {
		if (price <= 0) {
			throw new InvalidPriceException("Price must be a positive value.");
		}
		
		this.itemName = itemName;
		this.price = price;
		this.category = category;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) throws InvalidPriceException{
        if (price <= 0) {
            throw new InvalidPriceException("Price must be a positive value.");
        }
		
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Item [itemName=" + itemName + ", price=" + price + ", category=" + category + "]";
	}
}
