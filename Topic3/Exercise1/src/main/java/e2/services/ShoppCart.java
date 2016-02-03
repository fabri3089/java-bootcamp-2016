package e2.services;

import java.util.ArrayList;


public class ShoppCart {
	public  Product getProduct(String name){
		ArrayList<Product> prolist=new ArrayList<Product>();
		prolist=DB.loadProducts();
		for (Product pr : prolist) {
			if (pr.getName().equals(name) ) {
				return pr;
			}
		}
		return null;
		
	}
	public static ArrayList<Product> productList;
	
	public static ArrayList<Product> addProducts(String name, int quant) {
		productList = new ArrayList<Product>();
		ProductService productImp = new ProductService();
		Product pr=productImp.getProduct(name);
		if (pr != null && pr.getTotal()>=quant) {
			Product p=pr;
			productList.add(p);
			
		}
			return productList;
		
	}
}
