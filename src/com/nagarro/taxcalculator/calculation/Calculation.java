package com.nagarro.taxcalculator.calculation;

import com.nagarro.taxcalculator.enums.*;

public class Calculation {
	
	
	public double calculatesalesTax(String type, double price){
	
		double salesTax = 0.00d;
		
		if(ItemType.RAW.toString().equalsIgnoreCase(type)) {
			salesTax = price*(0.125); 
		}
		else if(ItemType.MANUFACTURED.toString().equalsIgnoreCase(type)) {
			salesTax = (price*(0.125)) + ((0.02)*((price*(0.125)) + price));
		}
		else if(ItemType.IMPORTED.toString().equalsIgnoreCase(type)) {
			salesTax = price*(0.1);
			if(salesTax<100)
				salesTax += 5;
			else if(salesTax>100 && salesTax<=200)
				salesTax += 10;
			else
				salesTax += salesTax*(0.05);
		}
		else {
			System.out.println("You have entered wrong type ");
		}
		return(salesTax);
	}
	
}
