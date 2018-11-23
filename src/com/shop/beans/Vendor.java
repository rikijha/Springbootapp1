package com.shop.beans;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shop.model.CartDB;

@Component
public class Vendor {
	private int id;
	
	@Pattern(regexp="\\w+",message="Please enter name")
	private String name;
	@Size(min=4,message="Please enter valid city")
	private String city;
    
	private CartDB cartDB;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	
	@Autowired
	public void setCartDB(CartDB cartDB) {
		this.cartDB = cartDB;
	}

	public void createVendor(Vendor v) {
		
		cartDB.createVendor(v);
	}

}
