package com.csc330.project;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

public class Reservations extends Calendar {

	private ArrayList<Reservations> rooms;
	
	Reservations reserveObj;
	
	public Reservations() {
	}
	
	public boolean addReservation() {
		
		
		  Reservations addRes = new Reservations();
		  
		  addRes.addReservation(/*null, getCalendarType()*/);
		return true;
		
	}
//reserves a particular room for this person
	  //returns false on failure (eg. room is already reserved)
	  /**
	   *Reserve room with person and room number.
	   */
	  public boolean makeReservation(String person, int roomNum) {
	    try {
	      if (rooms.get(roomNum - 1) == null) {
	        reserveObj = new Reservations();
	        rooms.set(roomNum  - 1,reserveObj);
	        roomNum++;
	        return true;
	      }
	    } catch (Exception vb) {
	      return false;
	    }
	    return false;
	  }
  
	  public boolean editReservation(Reservations changeReservation) {
		  
	  }
	  public Reservations viewReservation(int ReservationID) {
		  
	  }
	  
	  public 
	  
	//cancels all reservations by this person
	  /**
	   *Cancelling Reseravations.
	   */	  public void cancelReservations(String guest) {
	    for (int i = 0; i < rooms.size(); i++) {
	      if (rooms.get(i) != null) {
	        if (rooms.get(i).getName().equals(guest)) {
	          rooms.set(i,null);
	        }
	      }
	    }
	  }
	  
	  public void viewReservations() {
		    for (int i = 0; i < rooms.size(); i++) {
		      if (rooms.get(i) != null) {
		        System.out.println(rooms.get(i));  
		      } else {
		        System.out.println((i + 1) + " is not reserved");
		      }
		    }
		  }
		}
	  
	  
	  
	public static void main(String[] args) {
		
		Reservations newReservation = new Reservations();