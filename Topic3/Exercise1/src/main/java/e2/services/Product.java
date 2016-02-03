package e2.services;

import java.util.ArrayList;

public class Product {

	private int id;
	private String name;
	private int total;
	private double price;
	public Product(int id, String name, int quan, int pri) {
		this.id=id;
		this.name= name;
		this.total=quan;
		this.price=pri;
	}
	public Product() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", total=" + total + ", price=" + price + "]";
	}
	
}
