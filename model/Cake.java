package com.onlinecakeshopping.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cake_details")
public class Cake {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cake_id")
	private int cakeId;
	@Column(name = "cake_name")
	private String cakeName;
	@Column(name = "cake_price")
	private int cakePrice;
	@Column(name = "cake_quantity")
	private int cakeQuantity;
	
	public Cake() {
		super();

	}
	
	
	public Cake(int cakeId, String cakeName, int cakePrice, int cakeQuantity) {
		super();
		this.cakeId = cakeId;
		this.cakeName = cakeName;
		this.cakePrice = cakePrice;
		this.cakeQuantity = cakeQuantity;
	}


	public int getCakeId() {
		return cakeId;
	}


	public void setCakeId(int cakeId) {
		this.cakeId = cakeId;
	}


	public String getCakeName() {
		return cakeName;
	}


	public void setCakeName(String cakeName) {
		this.cakeName = cakeName;
	}


	public int getCakePrice() {
		return cakePrice;
	}


	public void setCakePrice(int cakePrice) {
		this.cakePrice = cakePrice;
	}


	public int getCakeQuantity() {
		return cakeQuantity;
	}


	public void setCakeQuantity(int cakeQuantity) {
		this.cakeQuantity = cakeQuantity;
	}


	@Override
	public String toString() {
		return "Cake [cakeId=" + cakeId + ", cakeName=" + cakeName + ", cakePrice=" + cakePrice + ", cakeQuantity="
				+ cakeQuantity + "]";
	}
	
	

}
