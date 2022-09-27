package com.onlinecakeshopping.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "admin_details")
public class Admin {
	
	

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "admin_id")
		private long adminId;
//		@NotBlank(message = "Name is mandatory")
		@Column(name = "admin_name")
		private String adminName;
		@Column(name = "admin_password")
		private String adminPassword;

		/**
		 * Admin default constructor
		 */
		public Admin() {

		}

		
		
		public Admin(long adminId, String adminName, String adminPassword) {
			super();
			this.adminId = adminId;
			this.adminName = adminName;
			this.adminPassword = adminPassword;
		}
		
		public long getAdminId() {
			return adminId;
		}
		 
		public void setAdminId(long adminId) {
			this.adminId = adminId;
		}
	
		public String getAdminName() {
			return adminName;
		}
		

		public void setAdminName(String adminName) {
			this.adminName = adminName;
		}

		
		public String getAdminPassword() {
			return adminPassword;
		}

		
		public void setAdminPassword(String adminPassword) {
			this.adminPassword = adminPassword;
		}

		@Override
		public String toString() {
			return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", adminPassword=" + adminPassword + "]";
		}

	}

