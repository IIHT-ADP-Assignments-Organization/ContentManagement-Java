package com.contentManagement.models;

public class Contacts {
	
	int contactsId;
	String linkedUser;
	String image;
	long telephone;
	long mobile;
	int fax;
	public int getContactsId() {
		return contactsId;
	}
	public void setContactsId(int contactsId) {
		this.contactsId = contactsId;
	}
	public String getLinkedUser() {
		return linkedUser;
	}
	public void setLinkedUser(String linkedUser) {
		this.linkedUser = linkedUser;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public long getTelephone() {
		return telephone;
	}
	public void setTelephone(long telephone) {
		this.telephone = telephone;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public int getFax() {
		return fax;
	}
	public void setFax(int fax) {
		this.fax = fax;
	}
	
	
	
}
