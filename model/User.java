package com.onlinecakeshopping.model;

import java.util.Set;

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


@Entity
@Table(name = "user_details")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private int userId;
	@Column(name = "user_name")
	private String userName;
	@Column(name = "user_password")
	private String userPassword;

	@OneToMany(targetEntity = RaiseComplaint.class)
	@Fetch(FetchMode.JOIN)
	@JoinColumn(name = "complaint_id")
	private Set<RaiseComplaint> raiseComplaint;

	@OneToMany(targetEntity = Feedback.class)
	@Fetch(FetchMode.JOIN)
	@JoinColumn(name = "feedback_id")
	private Set<Feedback> feedback;

	@ManyToOne(targetEntity = Order.class)
	@Fetch(FetchMode.JOIN)
	@JoinColumn(name = "order_id")
	private Order order;

	
	public User() {
		super();

	}

	
	public User(int userId, String userName, String userPassword, Set<RaiseComplaint> raiseComplaint,
			Set<Feedback> feedback, Order order) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.raiseComplaint = raiseComplaint;
		this.feedback = feedback;
		this.order = order;
	}

	
	public long getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}




	public String getUserName() {
		return userName;
	}

	
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public Set<RaiseComplaint> getRaiseComplaint() {
		return raiseComplaint;
	}

	public void setRaiseComplaint(Set<RaiseComplaint> raiseComplaint) {
		this.raiseComplaint = raiseComplaint;
	}

	public Set<Feedback> getFeedback() {
		return feedback;
	}

	public void setFeedback(Set<Feedback> feedback) {
		this.feedback = feedback;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword
				+ ", raiseComplaint=" + raiseComplaint + ", feedback=" + feedback + ", order=" + order + "]";
	}

}

