package storeApp;

import java.util.HashMap;
import java.util.Scanner;

public class Product {
	//Every product needs these base properties
	// name, quantity, serial number cost, sell price, 
	private String name;
	private int quantity;
	private long serialNumber;
	private double cost;
	private double salePrice;
	
	//Other features to add
	// 1) Sell by dates
	// 2) Have it so manager can see how many items need to sell each week
	// 3) List it out by product
	//    -Determine how much
	//    --each product cost the store to purchase
	//    --each product brings in revenue
	//    --each product makes in profit
	// 4) Make it to item can go on sale and determine the discount level
	
	
	Product(String name, int quantity, long serialNumber, double cost, double salePrice){
		this.name = name;
		this.quantity = quantity;
		this.serialNumber = serialNumber;
		this.cost = cost;
		this.salePrice = salePrice;
	}

	void giveName(){
		System.out.println("What will the name of the product be?");
		Scanner giver = new Scanner(System.in);
		String nameChanger = giver.next();
		this.name = nameChanger;
	}

	void giveQuantity(){
		System.out.println("What is the total quantity of items?");
		Scanner giver = new Scanner(System.in);
		int quantChanger = giver.nextInt();
		this.quantity = quantChanger;
	}

	void giveSerialNum(){
		System.out.println("What is products serial number?");
		Scanner giver = new Scanner(System.in);
		long serialChanger = giver.nextLong();
		this.serialNumber = serialChanger;
	}

	void giveStoreCost(){
		System.out.println("What is the total cost of each item?");
		Scanner giver = new Scanner(System.in);
		float costChanger = giver.nextFloat();
		this.cost = costChanger;
	}

	void giveSellPrice(){
		System.out.println("What is the selling price of product?");
		Scanner giver = new Scanner(System.in);
		float quantChanger = giver.nextFloat();
		this.salePrice = quantChanger;
	}
	
	void printInfo(){
		System.out.println("------------------------------------------------");
	    System.out.println("Product name: " + this.name + "\n" +
		"Total quantity: " + this.quantity + "\n" +
		"Serial Number: #" + this.serialNumber + "\n" +
		"Cost to buy: $" + this.cost + "\n" +
		"Current selling price: $" + this.salePrice);
	    System.out.println("------------------------------------------------");
	}
	

//	}
	
	public static void main(String[] args){
		Product product1 = new Product("Apple", 500, 3657890, 0.20, 1.34);
		
		product1.printInfo();
		
		product1.giveName();
		product1.giveQuantity();
		product1.giveSerialNum();
		product1.giveStoreCost();
		product1.giveStoreCost();
		
		product1.printInfo();
		
	}

}
