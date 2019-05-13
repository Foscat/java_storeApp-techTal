package storeApp;

import java.util.ArrayList;

public class Inventory {

	private ArrayList<Product> products;
	private Object myList;

	Inventory(){
		this.products = new ArrayList<Product>();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}


	void add(Product product) {
		// TODO Auto-generated method stub
		this.products.add(product);
	}
	
	void seeList(){
		for(Product product : this.products){
			product.printInfo();
		}
	}

}
