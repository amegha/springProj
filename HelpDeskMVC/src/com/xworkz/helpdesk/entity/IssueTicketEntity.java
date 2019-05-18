package com.xworkz.helpdesk.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="issue_ticket")
public class IssueTicketEntity {
	
	@Id
	@GenericGenerator(strategy="increment",name="ticket")
	@GeneratedValue(generator="ticket")
	@Column(name="TICKET_ID")
	private Integer issueId;
	@Column(name="NAME")
	private String name;
	@Column(name="MOBILE")
	private long mobile;
	@Column(name="PRODUCT")
	private String product;
	@Column(name="ISSUE_TYPE")
	private String issueType;
	@Column(name="DESCRIPTION")
	private String description;
	
	public Integer getIssueId() {
		return issueId;
	}
	public void setIssueId(Integer issueId) {
		this.issueId = issueId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getIssueType() {
		return issueType;
	}
	public void setIssueType(String issueType) {
		this.issueType = issueType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
