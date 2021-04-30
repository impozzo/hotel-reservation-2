package com.csc330.project;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

public class Reservations extends Calendar {

	public Reservations() {
	}
	
	public boolean addReservation() {
		
		
		  Reservations addRes = new Reservations();
		  
		  addRes.addReservation(/*null, getCalendarType()*/);
		return true;
		
	}

	public static void main(String[] args) {
		
		Reservations newReservation = new Reservations();
		
		

	/*
	 * Set<Guests> allGuestsSet = new HashSet<Guests>(); DataAccess d = new
	 * DataAccess();
	 * 
	 * allGuestsSet = d.getGuests();
	 * 
	 * // Nothing but formatting System.out.
	 * println("| GuestID |     FirstName     |     LastName       |     Email     |"
	 * );
	 * 
	 * // for each loop to loop through each Guests in the Set for (Guests
	 * currentGuest : allGuestsSet) { //prints out all the guests that are in the
	 * reservation system (very ugily) System.out.println(currentGuest.getGuestId()
	 * +" | " + currentGuest.getFirstName() +" | " + currentGuest.getLastName()
	 * +" | " + currentGuest.getEmail() + " |");
	 * 
	 * } 
	 */
	}
	
	///////////////////////////////// Calendar Overrides
	@Override
	protected void computeTime() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void computeFields() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(int field, int amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void roll(int field, boolean up) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getMinimum(int field) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMaximum(int field) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getGreatestMinimum(int field) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getLeastMaximum(int field) {
		// TODO Auto-generated method stub
		return 0;
	}
	///////////////////////////////// End Calendar Overrides
		
		
		

	}

