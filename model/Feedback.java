package com.onlinecakeshopping.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "feedback_details")
public class Feedback {

	@Id
	@Column(name = "feedback_id")
	private int feedbackId;
	@Column(name = "description")
	private String description;

	
	public Feedback() {
		super();
	}

	
	public Feedback(int feedbackId, String description) {
		super();
		this.feedbackId = feedbackId;
		this.description = description;
	}

	
	public int getFeedbackId() {
		return feedbackId;
	}
	
	
	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}

	
	public String getDescription() {
		return description;
	}

	
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "FeedBack [feedbackId=" + feedbackId + ", description=" + description + "]";
	}

}

