package com.a2soft.domain;

public class Person {

	private long id;
	private Name name;
	private Address address;
	private MobileNumber mobileNo;
	private EmailID emailID;

	public long getId() {
		return id;
	}

	public void setId(long id) {
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
		long result = 1;
		result = prime * result + id;
		return (int) result;
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
		if (other.getId() == 0) {
			return false;
		}
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + ", mobileNo=" + mobileNo + ", emailID="
				+ emailID + "]";
	}

	public void copyFrom(Person person) {
		this.address = person.address;
		this.emailID = person.emailID;
		this.mobileNo = person.mobileNo;

	}

}
