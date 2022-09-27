package com.onlinecakeshopping.model;

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
@Table(name = "customersupport_details")
public class CustomerSupport {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customerSupport_id")
	private long customerSupportId;
	@Column(name = "solve_complaint")
	private String solveComplaint;

	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(targetEntity = RaiseComplaint.class)
	@Fetch(FetchMode.JOIN)
	@JoinColumn(name = "complaint_id")
	private RaiseComplaint raiseComplaint;

	
	public CustomerSupport() {
		super();

	}

	
	public CustomerSupport(long customerSupportId, String solveComplaint, RaiseComplaint raiseComplaint) {
		super();
		this.customerSupportId = customerSupportId;
		this.solveComplaint = solveComplaint;
		this.raiseComplaint = raiseComplaint;
	}

	public long getCustomerSupportId() {
		return customerSupportId;
	}

	public void setCustomerSupportId(long customerSupportId) {
		this.customerSupportId = customerSupportId;
	}

	public String getSolveComplaint() {
		return solveComplaint;
	}

	public void setSolveComplaint(String solveComplaint) {
		this.solveComplaint = solveComplaint;
	}

	public RaiseComplaint getRaiseComplaint() {
		return raiseComplaint;
	}

	public void setRaiseComplaint(RaiseComplaint raiseComplaint) {
		this.raiseComplaint = raiseComplaint;
	}

	@Override
	public String toString() {
		return "CustomerSupport [customerSupportId=" + customerSupportId + ", solveComplaint=" + solveComplaint
				+ ", raiseComplaint=" + raiseComplaint + "]";
	}

}

