package com.a2soft.domain;

public class Store {
	private long id;
	private String storeName;
	private Address storeAddress;
	private Owner owner;
	private MobileNumber storeMobileNumber;
	private EmailID storeEmailID;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public Address getStoreAddress() {
		return storeAddress;
	}

	public void setStoreAddress(Address storeAddress) {
		this.storeAddress = storeAddress;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public MobileNumber getStoreMobileNumber() {
		return storeMobileNumber;
	}

	public void setStoreMobileNumber(MobileNumber storeMobileNumber) {
		this.storeMobileNumber = storeMobileNumber;
	}

	public EmailID getStoreEmailID() {
		return storeEmailID;
	}

	public void setStoreEmailID(EmailID storeEmailID) {
		this.storeEmailID = storeEmailID;
	}

	@Override
	public String toString() {
		return "Store [id=" + id + ", storeName=" + storeName + ", storeAddress=" + storeAddress + ", owner=" + owner
				+ ", storeMobileNumber=" + storeMobileNumber + ", storeEmailID=" + storeEmailID + "]";
	}

}
