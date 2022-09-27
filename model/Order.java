package com.onlinecakeshopping.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "order_details")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_id")
	private long orderId;
	@Column(name = "deliver_status")
	private String deliverStatus;
	@Column(name = "payment_status")
	private String paymentStatus;

	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(targetEntity = Cart.class)
	@Fetch(FetchMode.JOIN)
	@JoinColumn(name = "cart_id")
	private Cart cart;

	public Order() {
		super();

	}

	
	public Order(long orderId, String deliverStatus, String paymentStatus, Cart cart) {
		super();
		this.orderId = orderId;
		this.deliverStatus = deliverStatus;
		this.paymentStatus = paymentStatus;
		this.cart = cart;
	}

	
	public long getOrderId() {
		return orderId;
	}

	
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	
	public String getDeliverStatus() {
		return deliverStatus;
	}

	
	public void setDeliverStatus(String deliverStatus) {
		this.deliverStatus = deliverStatus;
	}

	
	public String getPaymentStatus() {
		return paymentStatus;
	}

	
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	
	public Cart getCart() {
		return cart;
	}

	
	public void setCart(Cart cart) {
		this.cart = cart;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", deliverStatus=" + deliverStatus + ", paymentStatus=" + paymentStatus
				+ ", cart=" + cart + "]";
	}

}

