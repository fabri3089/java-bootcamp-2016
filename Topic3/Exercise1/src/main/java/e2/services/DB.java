package e2.services;
import java.util.ArrayList;



public class DB {
public static ArrayList<Product> products;
public static ArrayList<Product> loadProducts(){
	if(products==null){
	products= new ArrayList<Product>();
	products.add(new Product(1,"Table",50,300));
	products.add(new Product(2,"Chair",100,120));
	products.add(new Product(3,"Sofa",80,450));
	}
	return products;
	
}

}
