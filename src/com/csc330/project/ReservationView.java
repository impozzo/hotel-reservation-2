package com.csc330.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReservationView {

	private Scanner keyboardInput;
	private static Guests guest;

	/**
	 * @return the guest
	 */
	public Guests getGuest() {
		return guest;
	}

	public ReservationView() {

		keyboardInput = new Scanner(System.in);
		guest = new Guests();

	}

	public Guests addGuestChoice(Guests newGuest) {
		Guests addGuest;
		if (newGuest != null)
			addGuest = newGuest;
		else
			addGuest = new Guests();

		System.out.print("Add new Guest's first name: ");
		addGuest.setFirstName(this.keyboardInput.nextLine());
		System.out.print("Add new Guest's last name: ");
		addGuest.setLastName(this.keyboardInput.nextLine());
		System.out.print("Add new Guest's email: ");
		addGuest.setEmail(this.keyboardInput.nextLine());

		return addGuest;
	}

	public void header() {
		System.out.printf("\n------------- Welcome to Morrison Hotel -------------\n");
		System.out.printf("      - 8021 Rothdell Trail - Los Angeles, CA 90046 -\n");
		System.out.printf("-----------------------------------------------------\n");
		System.out.println("---------- Enter [0] to return to main menu anytrime. ---------\n");
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
			chooseGuestOptionView();
			break;
		case 2:
			roomInformationView();
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


	public void entryPageView() {
		int choice = stepOneOption();
	}
	
	public void roomsInformationView() {

		ReservationView.clearScreen();
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
			// Rooms r = new Rooms();

			break;
		case 3:
			System.out.print("you pressed 3");
			break;
		default:
			mainOptions();
		}

	}
	public Rooms getroomView(String roomNumber) {

	}
	
	public void reservationsInformationView() {

	}
	public int addReservationView(Reservations addReservation) {

	}
	public boolean removeReservationView(int reservationID) {

	}
	public boolean editReservationView(int reservationID) {

	}
	public Reservations getReservationView(int reservationID) {

	}
	
	public void guestsInformationView() {

		String[] optionArray = new String[] { "Add Guest", "Edit / Delete Guest", "Search Guest" };

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

			break;
		case 3:
			System.out.print("you pressed 3");
			break;
		default:
			mainOptions();
		}
		

	}
	public int adddGuestView(Guests addGuest) {

		return 1;
	}
	public boolean removeGuestView(int guestID) {

	}
	public boolean editGuestView(int guestID) {

	}
	public Guests getGuestView(int guestID) {

	}
	public List<Guests> getGuestsView() {

		List<Guests> g = new ArrayList();
		
		reyurn g;
	}

	public void allRoomsView() {

		Rooms rooms = new Rooms();

		List<Rooms> roomList = rooms.showAllRooms();

		for (Rooms room : roomList) {
			System.out.println(room.toString());
		}

	}

	public static void clearScreen() {
		System.out.print("\033[H\033[2J");
		System.out.flush();

	}
}