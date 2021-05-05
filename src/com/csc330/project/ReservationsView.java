package com.csc330.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReservationsView {

	private Scanner keyboardInput;
	private static Guests guest;
	private Reservations reservation;
	private Rooms room;
	
	/**
	 * @return the guest
	 */
	/*
	 * public Guests getGuest() { return guest; }
	 */
///////////////////////////// Main Methods
	public ReservationsView() {

		keyboardInput = new Scanner(System.in);
		guest = new Guests();

	}
	
	public int stepOneOption() {
		String[] optionArray = new String[] { "Guest Information", "Reservation Information", "Room Information" };

		header();
		System.out.println("\nChoose an option:");

		for (int i = 0; i < optionArray.length; i++) {
			System.out.println("[" + (i + 1) + "] " + optionArray[i]);
		}
		System.out.print("?");

		int inputChoice = Integer.parseInt(this.keyboardInput.nextLine());

		switch (inputChoice) {
		case 0:

			mainOptions();
			break;
		case 1:
			chooseGuestOption();
			break;
		case 2:
			chooseReservationOption();
			break;
		case 3:
			roomInformationView();
			break;
		default:
			mainOptions();
		}
		return inputChoice;

	}
	
	public void mainOptions() {
		header();
		int choice = stepOneOption();
	}
	
	
	public static void clearScreen() {  
	    System.out.print("\033[H\033[2J");  
	    System.out.flush(); 

}
	
///////////////////////// End Main Methods
	
///////////////////////////// Guests Methods
	
	public  void addGuestChoice(Guests newGuest) {
		
		Guests addGuest;
		
		
		  if (newGuest != null)
		  {
			  addGuest = newGuest;
		  }
		  
		  else 
		  {
			  addGuest = new Guests();
		  }
		System.out.print("Add new Guest's first name: ");
		addGuest.setFirstName(this.keyboardInput.nextLine());
		
		System.out.print("Add new Guest's last name: ");
		addGuest.setLastName(this.keyboardInput.nextLine());
		
		System.out.print("Add new Guest's email: ");
		addGuest.setEmail(this.keyboardInput.nextLine());
		
		System.out.print("Add new Guest's cell phone number: ");
		addGuest.setEmail(this.keyboardInput.nextLine());
		
		System.out.print("Add new Guest's street address: ");
		addGuest.setEmail(this.keyboardInput.nextLine());

		System.out.print("Add new Guest's zip code: ");
		addGuest.setEmail(this.keyboardInput.nextLine());
		
		System.out.print("Add new Guest's city: ");
		addGuest.setEmail(this.keyboardInput.nextLine());
		
		System.out.print("Add new Guest's state: ");
		addGuest.setEmail(this.keyboardInput.nextLine());
		
		//System.out.print("Has the guest stayed at the hotel before? If so, how many times: ");
		//addGuest.setEmail(this.keyboardInput.nextLine());
		
		if (guest.addGuest(addGuest)) // success!
		{
			System.out.print("\nNew Guest added!");
			chooseGuestOption();
		}
		//return addGuest;
	}

	
	public void editGuest()
	{
		
		// reservation view: guest edit or delete method 
		int choice = 0;

		System.out.println("Enter the number of what you would like to do: "); 
		System.out.println("1. Edit a guest's reservation information"); 
		System.out.println("2. Remove a guest's information from the system"); 

		// system in choice 
		if(choice == 1) {
			System.out.println(); 
			System.out.println("Which guest reservation would you like to edit? Enter their Guest ID: "); 
			// system in guest ID
			
			System.out.println(); 
			// print the guest's information 
			
			System.out.println(); 
			System.out.println("Enter the number of what you would like to edit: ");
			System.out.println("1. First Name ");
			System.out.println("2. Last Name ");
			System.out.println("3. Email ");
			System.out.println("4. Phone Number ");
			System.out.println("5. Street Address ");
			System.out.println("6. Zip Code ");
			System.out.println("7. City ");
			System.out.println("8. State ");
			// system in choice 
			
			if(choice == 1) {
				System.out.println("What would you like to change the guest's first name to?");
				// system in new first name
			}
			else if(choice == 2) {
				System.out.println("What would you like to change the guest's last name to?");
				// system in new last name
			}
			else if(choice == 3) {
				System.out.println("What would you like to change the guest's email to?");
				// system in new email
			}
			else if(choice == 4) {
				System.out.println("What would you like to change the guest's phone number to?");
				// system in new phone number
			}
			else if(choice == 5) {
				System.out.println("What would you like to change the guest's street address to?");
				// system in new street address
			}
			else if(choice == 6) {
				System.out.println("What would you like to change the guest's zip code to?");
				// system in new zip code
			}
			else if(choice == 7) {
				System.out.println("What would you like to change the guest's City to?");
				// system in new city
			}
			else {
				System.out.println("What would you like to change the guest's State to?");
				// system in new state
			}
			
			// send confirmation that the info has been changed and print new updated guest info 
		}
		else {
			System.out.println("Which guest would you like to remove from the system? Enter their Guest ID: ");
			// send a confirmation that the guest has successfully been deleted 
		}
		
		
	}
	
	/*
	 * public int stepOneOption() { String[] optionArray = new String[] {
	 * "Guest Information", "Reservation Information", "Room Information" };
	 * 
	 * header(); System.out.println("\nChoose an option:");
	 * 
	 * for (int i = 0; i < optionArray.length; i++) { System.out.println("[" + (i +
	 * 1) + "] " + optionArray[i]); } System.out.print("?");
	 * 
	 * int inputChoice = Integer.parseInt(this.keyboardInput.nextLine());
	 * 
	 * switch (inputChoice) { case 0:
	 * 
	 * mainOptions(); break; case 1: chooseGuestOption(); break; case 2:
	 * chooseReservationOption(); break; case 3: roomInformation(); break; default:
	 * mainOptions(); } return inputChoice;
	 * 
	 * }
	 */

	

	///////// Currently working on
	public int chooseGuestOption() {
		String[] optionArray = new String[] { "Add Guest", "Edit Guest", "Delete Guest", "Search Guest" };

		header();
		System.out.println("\nChoose an option:");

		for (int i = 0; i < optionArray.length; i++) {
			System.out.println("[" + (i + 1) + "] " + optionArray[i]);
		}
		System.out.print("?");

		int inputChoice = Integer.parseInt(this.keyboardInput.nextLine());

		switch (inputChoice) {
		case 0:
			mainOptions();
			break;
		case 1:
			addGuestChoice(null);
			break;
		case 2:
			System.out.print("you pressed 2");
			editGuest();
			break;
		case 3:
			System.out.print("you pressed 3");
			break;
		default:
			mainOptions();
		}
		return inputChoice;

	}
	
	
///////////////////////// End Guests Methods
	
///////////////////////////// Reservations Methods
	
	// currently working
	public int chooseReservationOption() {
		
		String[] optionArray = new String[] { "Add Reservation", "Edit Reservation", "Delete Reservation", "Search Reservation" };

		header();
		System.out.println("\nChoose an option:");

		for (int i = 0; i < optionArray.length; i++) {
			System.out.println("[" + (i + 1) + "] " + optionArray[i]);
		}
		System.out.print("?");

		int inputChoice = Integer.parseInt(this.keyboardInput.nextLine());

		switch (inputChoice) {
		case 0:
			mainOptions();
			break;
		case 1:
			addReservationView();
			//addReservationChoice();
			break;
		case 2:
			System.out.print("you pressed 2");
			editGuest();
			break;
		case 3:
			System.out.print("you pressed 3");
			break;
		default:
			mainOptions();
		}
		
		return 1;
	}
		
	// currently working	
	private void addReservationView() {
		CompleteReservations addCompleteReservation = new CompleteReservations();
		  
//		  addResView.addReservation(/*null, getCalendarType()*/);
		
	}
	
///////////////////////// End Reservations Methods
	
	
///////////////////////////// Rooms Methods
	
	public void roomInformationView() {
		
		ReservationsView.clearScreen();
		Rooms rooms = new Rooms();
		
		header();
		System.out.println("\nRoom Information:\n");
		String[] optionArray = new String[] { "View room", "View all roomst" };

		header();
		System.out.println("\nChoose an option:");

		for (int i = 0; i < optionArray.length; i++) {
			System.out.println("[" + (i + 1) + "] " + optionArray[i]);
		}
		System.out.print("?");

		int inputChoice = Integer.parseInt(this.keyboardInput.nextLine());

		switch (inputChoice) {
		case 0:
			entryPageView();
			break;
		case 1:
			
			break;
		case 2:
			System.out.print("you pressed 2");
			allRoomsView();
			//Rooms r = new Rooms();
			
			break;
		case 3:
			System.out.print("you pressed 3");
			break;
		default:
			mainOptions();
		}

	}
	
	
	  public void allRoomsView() {
	  
	  Rooms rooms = new Rooms();
	  
//	  List<Rooms> roomList = rooms.showAllRooms();
//	  
//	  for (Rooms room : roomList) { System.out.println(room.toString()); }
//	  
	  }
	 
	
	
///////////////////////// End Rooms Methods
	



	public void entryPageView() {
		int choice = stepOneOption();
	}
	

	public void header() {
		System.out.printf("\n------------- Welcome to Morrison Hotel -------------\n");
		System.out.printf("      - 8021 Rothdell Trail - Los Angeles, CA 90046 -\n");	
		System.out.printf("-----------------------------------------------------\n");
		System.out.println("---------- Enter [0] to return to main menu anytrime. ---------\n");
	}

	
	




	
}
