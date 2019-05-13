package store;

public class Item {
	private String name;
	private int quantity;
	private long serialNumber;
	private double cost;
	private double salePrice;
	
	//Getters and setters
	///////////////////////////////////////
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//////////////////////////////////////
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	////////////////////////////////////////////
	public long getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(long serialNumber) {
		this.serialNumber = serialNumber;
	}
	/////////////////////////////////////////
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	/////////////////////////////////////////
	public double getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}
	////////////////////////////////////////////
}
