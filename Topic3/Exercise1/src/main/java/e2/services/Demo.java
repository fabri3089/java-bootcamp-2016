package e2.services;

import java.util.ArrayList;

public class Demo {
      static ArrayList<Product> productL=new ArrayList<Product>();
	public static void main(String[] args) {
		IProductService productsServices = new ProductService();
		productL=productsServices.addProducts("Chair",6);
		
		
		for (Product product : ShoppCart.productList ) {
			System.out.println(product.getName()+" $"+product.getPrice());
		}
		//CRUD
		UserService userService = new UserService();
		userService.createUser(new User(5,"Gonzalo","aa","aaf"));
		userService.readUser(1);
		userService.updateUser(2);
		userService.deleteUser(4);
		
	}

}
