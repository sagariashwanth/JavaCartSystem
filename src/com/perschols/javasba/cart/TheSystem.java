package com.perschols.javasba.cart;

import java.util.HashMap;
import java.util.Map;

public abstract class TheSystem {
	
	private Map<String, Integer> itemCollection;
	
	/*
	 * constructor where itemCollection is initialized with an empty HashMap.
	 */
	public TheSystem() {
		itemCollection = new HashMap<>();
	}
	
	public boolean checkAvailability() {
		return false;
		
	}
	
	public boolean add() {
		return false;
		
	}
	
	public Item remove() {
		return null;
		
	}

}
