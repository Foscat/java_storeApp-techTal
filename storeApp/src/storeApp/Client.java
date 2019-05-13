package storeApp;

import java.util.Scanner;

public class Client {

	// Basic scanner
	private static Scanner ask = new Scanner(System.in);

	private static Inventory myInventory = new Inventory();
	
	public static int numPro(){
		System.out.println("How many products would you like to add to inventory?");
		int getInt = ask.nextInt();
		return getInt;
	}

	public static Inventory myStore(int proNum){

		Inventory myInventory = new Inventory();
		
		for(int i=0; i<proNum; i++){
			Product newItem = new Product();
			myInventory.add(newItem);
		}
		myInventory.seeList();

		return myInventory;
	}



	public static void main(String[] args){
		myStore(2);
	}
}
