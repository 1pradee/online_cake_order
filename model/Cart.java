package com.onlinecakeshopping.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "cart_details")
public class Cart implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cart_id")
	private long cartId;
	@Column(name = "total_bill")
	private long totalBill;
	@Column(name = "invoice")
	private String invoice;

	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(targetEntity = Cake.class)
	@Fetch(FetchMode.JOIN)
	@JoinColumn(name = "cake_id")
	private Cake cake;
	
	public Cart() {
		super();

	}

	public Cart(long cartId, long totalBill, String invoice, Cake cake) {
		super();
		this.cartId = cartId;
		this.totalBill = totalBill;
		this.invoice = invoice;
		this.cake = cake;
	}

	public long getCartId() {
		return cartId;
	}

	public void setCartId(long cartId) {
		this.cartId = cartId;
	}

	public long getTotalBill() {
		return totalBill;
	}

	public void setTotalBill(long totalBill) {
		this.totalBill = totalBill;
	}

	public String getInvoice() {
		return invoice;
	}

	public void setInvoice(String invoice) {
		this.invoice = invoice;
	}

	public Cake getCake() {
		return cake;
	}

	public void setCake(Cake cake) {
		this.cake = cake;
	}

	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", totalBill=" + totalBill + ", invoice=" + invoice + ", cake=" + cake + "]";
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
