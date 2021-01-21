package com.nagarro.taxcalculator.model;

import com.nagarro.taxcalculator.calculation.*;

public class ItemDetail {
		
	public String name, type;
	public double price, salesTax, finalPrice;
	public long quantity;
	
	
	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price= price;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void getDetails() {

		Calculation calc = new Calculation();
		
		salesTax = calc.calculatesalesTax(type, price);
		
		finalPrice = price + salesTax;
		
		System.out.println("\nItem Name:- "+ name +"  |  Item Price:- " + price + "  |  Item Sales Tax:- " + salesTax + "  |  Item Final Price:- " + finalPrice);
	}



	
}
