package shop.entity;

import java.util.List;

public class Order {
	private String orderID;
	private List<Item> itemList;
	private  double totalPrice;
	
	public Order(String orderID, List<Item> itemList, double totalPrice) {
		super();
		this.orderID = orderID;
		this.itemList = itemList;
		this.totalPrice = totalPrice;
	}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public List<Item> getItemList() {
		return itemList;
	}

	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
    public double calculateTotalPrice() {
        totalPrice = 0;
        for (Item item : itemList) {
            totalPrice += item.getPrice() * item.getPrice();
        }
        return totalPrice;
    }
}
