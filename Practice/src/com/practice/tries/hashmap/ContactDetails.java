package com.practice.tries.hashmap;

public class ContactDetails {
	String mobileNo;
	String emailId;
	
	
	public ContactDetails(String mobileNo, String emailId) {
		super();
		this.mobileNo = mobileNo;
		this.emailId = emailId;
	}


	@Override
	public String toString() {
		return "ContactDetails [mobileNo=" + mobileNo + ", emailId=" + emailId + "]";
	}
	
}
