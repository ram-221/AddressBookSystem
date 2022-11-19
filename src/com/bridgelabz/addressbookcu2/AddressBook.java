package com.bridgelabz.addressbookcu2;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

	 ArrayList<Contacts> arrayDetails = new ArrayList<Contacts>();
	    Scanner sc = new Scanner(System.in);

	    public void addDetails () {

	        Contacts contact = new Contacts();

	        System.out.println("Enter the first name");
	        contact.setFirstName(sc.nextLine());
	        System.out.println("Enter the last name");
	        contact.setLastName(sc.nextLine());
	        System.out.println("Enter the address");
	        contact.setAddress(sc.nextLine());
	        System.out.println("Enter the city");
	        contact.setCity(sc.nextLine());
	        System.out.println("Enter the state");
	        contact.setState(sc.nextLine());
	        System.out.println("Enter the email");
	        contact.setEmail(sc.nextLine());
	        System.out.println("Enter the zip code");
	        contact.setZip(sc.nextInt());
	        System.out.println("Enter the phone number");
	        contact.setPhoneNumber(sc.nextLine());
	        arrayDetails.add(contact);
	    }

	    public void display() {

	        System.out.println(arrayDetails);
	    }

	    public static void main (String[]args){

	        AddressBook aBook = new AddressBook();    
	        aBook.addDetails();
	        aBook.display();
	    }
}
