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
@Table(name = "raisecomplaint_details")
public class RaiseComplaint {

	@Id
	
	@Column(name = "complaint_id")
	private long complaintId;
	@Column(name = "complaint_description")
	private String complaintDescription;

	
	public RaiseComplaint() {
		super();

	}

	
	public RaiseComplaint(long complaintId, String complaintDescription) {
		super();
		this.complaintId = complaintId;
		this.complaintDescription = complaintDescription;
	}
	
	public long getComplaintId() {
		return complaintId;
	}
	
	public void setComplaintId(long complaintId) {
		this.complaintId = complaintId;
	}



	public String getComplaintDescription() {
		return complaintDescription;
	}
	
	public void setComplaintDescription(String complaintDescription) {
		this.complaintDescription = complaintDescription;
	}

	@Override
	public String toString() {
		return "RaiseComplaint [complaintId=" + complaintId + ", complaintDescription=" + complaintDescription + "]";
	}

}

