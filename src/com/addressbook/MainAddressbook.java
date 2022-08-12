package com.addressbook;

import java.util.ArrayList;

public class MainAddressbook {

	public static void main(String[] args) {
		
		System.out.println("Wel-Come To AddressBook Project");
		
		 ArrayList <Contacts> arraylist = new ArrayList();
		
		 AddressBook addressbook =new AddressBook();
		 addressbook.operation(arraylist);
		 
		
	}
	
}
