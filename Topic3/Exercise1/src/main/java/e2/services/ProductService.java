package e2.services;

import java.util.ArrayList;

public class ProductService implements IProductService{

	

	public Product getProduct(String name){
		ShoppCart sc= new ShoppCart();
	return sc.getProduct(name);
	}

	public ArrayList<Product> addProducts(String name, int quant) {
		return ShoppCart.addProducts(name, quant);
		
	}
	
	

}
