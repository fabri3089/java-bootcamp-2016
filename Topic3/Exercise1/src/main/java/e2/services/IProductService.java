package e2.services;

import java.util.ArrayList;

public interface IProductService {

 public Product getProduct(String name);
 public ArrayList<Product> addProducts(String name, int quantity);

}
