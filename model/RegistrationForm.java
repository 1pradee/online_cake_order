package com.onlinecakeshopping.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "registration_details")
public class RegistrationForm {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "registration_id")
	private long userId;
	
	@Column(name = "user_Name")
	private String userName;
	@Column(name = "user_Password")
	private String userPassword;
	@Column(name = "user_Address")
	private String userAddress;
	@Column(name = "user_City")
	private String userCity;
	@Column(name = "user_State")
	private String userState;

	
	public RegistrationForm() {
		super();

	}
	
	public RegistrationForm(long userId, String userName, String userPassword, String userAddress, String userCity,
			String userState) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userAddress = userAddress;
		this.userCity = userCity;
		this.userState = userState;
	}



	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
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
	
	public String getUserAddress() {
		return userAddress;
	}
	
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserCity() {
		return userCity;
	}
	
    
	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}
	
	public String getUserState() {
		return userState;
	}
	
	public void setUserState(String userState) {
		this.userState = userState;
	}

	@Override
	public String toString() {
		return "Registrationform [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword
				+ ", userAddress=" + userAddress + ", userCity=" + userCity + ", userState=" + userState + "]";
	}

}

