package com.shopp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;









@RestController
public class ShoppCartController {
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private PurchaseRepository purchaseRepository;
	@RequestMapping("/login")
	  @ResponseBody
	  public String login(String username, String password) {
	  
	   
	      User user = userRepository.findByUsernameAndPassword(username, password);
	      if(user==null)
	      {
	    	  return "User not found";
	      }
	      else
	      {  
	    	  return "Welcome " +user.getName();
	    	  
	      }
	    }
	@RequestMapping("/createUser")
	  @ResponseBody
	  public String create(String name, String username, String password) {
		  
		    try {
		    	userRepository.save(new User(name, username, password ));
		     String list="";
		     list = list.concat("User succesfully created"+"<p>"+name);
		     return list;
		    }
		    catch (Exception ex) {
		      return "Error creating the user: " + ex.toString();
		    }
		    
		  }
	@RequestMapping("/findProductsByName")
	  @ResponseBody
	  public String findProductsByName(String name) {
	    try {
	    	
	      List<Product> products = productRepository.findByName(name);
	      
	      
	      String list="";
	      for ( Product product: products)
	      {
	    	 list=list.concat("<p>"+product.getName() + " "+ product.gettotal() + " "+ product.getprice() + " "+ product.getCategory());
	      }
	      
	      return list;
	    }
	    catch (Exception ex) {
	      return "Error find product by name";
	    }
	  }@RequestMapping("/findProductsByCategory")
	  @ResponseBody
	  public String findProductsByCategory(String category) {
	    try {
	    	
	      List<Product> products = productRepository.findByCategory(category);
	      
	      
	      String list="";
	      for ( Product product: products)
	      {
	    	 list=list.concat("<p>"+product.getName() + " "+ product.gettotal() + " "+ product.getprice() + " "+ product.getCategory());
	      }
	      
	      return list;
	    }
	    catch (Exception ex) {
	      return "Error find product by category";
	    }
	  }
	  @RequestMapping("/saveCart")
	  @ResponseBody
	  public String addProduct(Long user, Long product, int quantity, int purchasenumber) 
	  {
	    try {
	    
	      Purchase purchase = new Purchase( user, product, quantity, purchasenumber );
	      purchaseRepository.save(purchase);
	      return ("Cart succesfully saved");
	    }
	    catch (Exception ex) {
	      return "Error save cart";
	    }
	  }
	  @RequestMapping("/buyProducts")
	  @ResponseBody
	  public String buyProducts(Long user, int purchasenumber, int creditcard) 
	  {
	    try {
	    
	    	List<Purchase> list = purchaseRepository.findByPurchasenumber(purchasenumber);
	    	
	    	String result = "" + list.size() + "";
	    	
	    	for ( int i = 0; i < list.size() ; i ++ )
	    	{
	    		Purchase purchase = list.get(i);
	    		purchase.setCreditcard(creditcard);
	            purchaseRepository.save(purchase);
	    	}
	      return "Succes buy order";
	      
	    }
	    catch (Exception ex) {
	      return "Error buy products";
	    }
}
	  }
	 
	  
	  
	

