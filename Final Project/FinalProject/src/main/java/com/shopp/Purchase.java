package com.shopp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="buys")
public class Purchase {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@JsonIgnore
	private Long user;
	private Long product;
	private int quantity;
	private int purchasenumber;
	private int creditcard;

	public Purchase(Long user, Long product, int quantity, int purchasenumber, int creditcard) {
	
	this.user = user;
	this.product = product;
	this.quantity=quantity;
	this.purchasenumber = purchasenumber;
	this.creditcard = creditcard;
	}
	
	public Purchase(Long user, Long product, int quantity, int purchasenumber ) {
		
		this.user = user;
		this.product = product;
		this.quantity=quantity;
		this.purchasenumber = purchasenumber;
		
		}

	public Long getId() {
	return id;
	}

	public void setId(Long id) {
	this.id = id;
	}

	public Long getUser() {
	return user;
	}

	public void setUser(Long user) {
	this.user = user;
	}

	public Long getProduct() {
	return product;
	}

	public void setProduct(Long product) {
	this.product = product;
	}
	
	public int getQuantity(){
		return quantity;
	}
	public void setQuantity(int quantity){
		this.quantity=quantity;
	}
	public int getCreditCard() {
		return creditcard;
	}

	public void setCreditcard(int creditcard) {
		this.creditcard = creditcard;
	}
	
	public int getPurchasenumber() {
		return purchasenumber;
	}

	public void setPurchasenumber(int purchasenumber) {
		this.purchasenumber = purchasenumber;
	}
	
	Purchase(){
		
	}
}

