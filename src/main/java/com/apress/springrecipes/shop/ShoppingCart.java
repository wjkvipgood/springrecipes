package com.apress.springrecipes.shop;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
	private List<Product> items = new ArrayList<Product>();

	public List<Product> getItems() {
		return items;
	}

	public void addItem(Product item) {
		items.add(item);
	}
	
}
