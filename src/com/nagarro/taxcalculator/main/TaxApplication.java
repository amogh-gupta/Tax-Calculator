package com.nagarro.taxcalculator.main;

import java.util.Scanner;

import com.nagarro.taxcalculator.constants.*;
import com.nagarro.taxcalculator.model.*;

public class TaxApplication {
	public static void main(String[] args) {

		try {
			Scanner scanner = new Scanner(System.in);

			while (true) {

				ItemDetail itemDetail = new ItemDetail();

				// Type Name
				System.out.print(Constants.ITEM_NAME);
				itemDetail.setName(scanner.nextLine());

				// Type Price
				System.out.print(Constants.ITEM_PRICE);
				itemDetail.setPrice(scanner.nextDouble());

				// Type Quantity
				System.out.print(Constants.ITEM_QUANTITY);
				itemDetail.setQuantity(scanner.nextLong());

				// Item type is mandatory
				setType(scanner, itemDetail);

				// Calling the function to Printing all details
				itemDetail.getDetails();

				// Repeating the code until user enter 'n'
				System.out.print(Constants.CODE_REPEAT);
				if (scanner.nextLine().equalsIgnoreCase(Constants.NO)) {
					break;
				}
			}
			scanner.close(); // Closing scanner class
		} catch (Exception e) {
			System.out.println(Constants.ERROR + e.getMessage());
		}
		System.out.println(Constants.END);
	}

	private static void setType(Scanner scanner, ItemDetail itemDetail) {

		int count = 0;
		String choice = "";
		while (true) {
			System.out.print(Constants.ITEM_TYPE);
			if (count == 0)
				scanner.nextLine();
			choice = scanner.nextLine();
			count++;

			// Checking whether user enter some input or not
			if (choice.length() > 0) {
				break;
			} else {
				System.out.println(Constants.TYPE_NOT_NULL);
			}
		}
		itemDetail.setType(choice);
	}

}
