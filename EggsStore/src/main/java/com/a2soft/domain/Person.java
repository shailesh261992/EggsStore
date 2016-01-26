package com.a2soft.domain;

public class Person {

	private int id;
	private Name name;
	private Address address;
	private MobileNumber mobileNo;
	private EmailID emailID;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public MobileNumber getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(MobileNumber mobileNo) {
		this.mobileNo = mobileNo;
	}

	public EmailID getEmailID() {
		return emailID;
	}

	public void setEmailID(EmailID emailID) {
		this.emailID = emailID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if(other.getId() ==0){
			return false;
		}
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Person [Id = " + id + " ]";
	}

	public void copyFrom(Person person) {
		this.address = person.address;
		this.emailID = person.emailID;
		this.mobileNo = person.mobileNo;
		
		
		
	}

}
