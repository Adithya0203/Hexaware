package shop.entity;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private List<Item> cartItems;

//	constructor
	public ShoppingCart(List<Item> cartItems) {
		super();
		this.cartItems = cartItems;
	}

//	getter and setter
	public List<Item> getCartItems() {
		return cartItems;
	}

	public void setCartItems(List<Item> cartItems) {
		this.cartItems = cartItems;
	}
	
//	methods

//	to add item to shopping cart
	public void addItem(Item item) {
		cartItems.add(item);
		System.out.println(item.getItemName() + " added to cart");
	}
	
	public void removeItem(Item item) {
		if(cartItems.remove(item)) {
			System.out.println(item.getItemName() + " removed from cart");
		} else {
			System.out.println(item.getItemName() + " not in cart");
		}
	}
	
	public void listCartItems() {
		if(cartItems.isEmpty()) {
			System.out.println("The cart is empty");
		} else {
			System.out.println("Items in the cart:" + "\n");
			for(Item item : cartItems) {
				System.out.println(" - " + item.getItemName() + " | Price: $" + item.getPrice() + " | Category: " + item.getCategory());
			}
		}
	}
	
	public void clearCart() {
		cartItems.clear();
		System.out.println("Cart items have been removed");
	}
}

