package com.bridgeit.AddressBookSystemJDBC;

public class AddressBook {

	private final String FirstName, LastName, Address, CityName, StateName;
	public final double zip;
	public final double PhoneNumber;
	private final String EmailID;

	public AddressBook(String FirstName, String LastName, String Address, String CityName, String StateName, double zip,
			double PhoneNumber, String EmailID) {
		super();
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.Address = Address;
		this.CityName = CityName;
		this.StateName = StateName;
		this.zip = zip;
		this.PhoneNumber = PhoneNumber;
		this.EmailID = EmailID;
	}

	public static void main(String[] args) {
		System.out.println("Wel-Come to Address_Book_System Program");
		
	}
	
}