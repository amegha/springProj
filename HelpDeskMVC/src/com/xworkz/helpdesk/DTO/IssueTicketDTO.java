package com.xworkz.helpdesk.DTO;

import java.io.Serializable;
//staging
public class IssueTicketDTO implements Serializable{
	private String name;
	private long mobile;
	private String product;
	private String issueType;
	private String description;
	
public IssueTicketDTO() {
	System.out.println("created \t"+this.getClass().getSimpleName());
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

@Override
public String toString() {
	return "IssueTicketDTO [name=" + name + ", mobile=" + mobile + ", product=" + product + ", issueType=" + issueType
			+ ", description=" + description + "]";
}

}
