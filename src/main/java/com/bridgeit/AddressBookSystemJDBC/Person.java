package com.bridgeit.AddressBookSystemJDBC;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person {
	
	public static AddressBook newPerson() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("first name : ");
		String firstName = scanner.next();
		System.out.println("last name : ");
		String lastName = scanner.next();
		System.out.println("address : ");
		String address = scanner.next();
		System.out.println("city name : ");
		String cityName = scanner.next();
		System.out.println("state name : ");
		String stateName = scanner.next();
		System.out.println("zip : ");
		String zip = scanner.next();
		System.out.println("phone number : ");
		String phoneNumber = scanner.next();
		AddressBook addressBook = new AddressBook(firstName, lastName, address, cityName, stateName, zip, phoneNumber);
		return addressBook;
	}

	public AddressBook updateDetails(String name,AddressBook addressBook) {
		
		if (addressBook.getFirstName().equals(name)) {
			addressBook = newPerson();
		}
		return addressBook;
	}

	public static void main(String[] args) {

		System.out.println("welcome to the address book program");
		AddressBook addressBook = newPerson();
		System.out.println(addressBook);
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a name");
		String name = scanner.next();
		Person newPerson=new Person();
		addressBook = newPerson.updateDetails(name,addressBook);
		System.out.println(addressBook);
	}
}