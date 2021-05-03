
package com.csc330.project;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

public class Reservations extends Calendar {

	private ArrayList<Reservations> rooms;
	
	Reservations reserveObj;
	
	private int reservationId;
	private int guestId;
	private int roomId;
	private int daysStay;
	private Date startDate;
	private Date dateCreated;
	private String paidStatus;
	private String reservationStatus;
	private String confirmStatus;
	private double totalCost;
	
	
	/**
	 * @return the guestId
	 */
	public int getGuestId() {
		return guestId;
	}

	/**
	 * @param guestId the guestId to set
	 */
	public void setGuestId(int guestId) {
		this.guestId = guestId;
	}

	/**
	 * @return the roomId
	 */
	public int getRoomId() {
		return roomId;
	}

	/**
	 * @param roomId the roomId to set
	 */
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	/**
	 * @return the daysStay
	 */
	public int getDaysStay() {
		return daysStay;
	}

	/**
	 * @param daysStay the daysStay to set
	 */
	public void setDaysStay(int daysStay) {
		this.daysStay = daysStay;
	}

	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the dateCreated
	 */
	public Date getDateCreated() {
		return dateCreated;
	}

	/**
	 * @param dateCreated the dateCreated to set
	 */
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	/**
	 * @return the paidStatus
	 */
	public String getPaidStatus() {
		return paidStatus;
	}

	/**
	 * @param paidStatus the paidStatus to set
	 */
	public void setPaidStatus(String paidStatus) {
		this.paidStatus = paidStatus;
	}

	/**
	 * @return the reservationStatus
	 */
	public String getReservationStatus() {
		return reservationStatus;
	}

	/**
	 * @param reservationStatus the reservationStatus to set
	 */
	public void setReservationStatus(String reservationStatus) {
		this.reservationStatus = reservationStatus;
	}

	/**
	 * @return the confirmStatus
	 */
	public String getConfirmStatus() {
		return confirmStatus;
	}

	/**
	 * @param confirmStatus the confirmStatus to set
	 */
	public void setConfirmStatus(String confirmStatus) {
		this.confirmStatus = confirmStatus;
	}

	/**
	 * @return the totalCost
	 */
	public double getTotalCost() {
		return totalCost;
	}

	/**
	 * @param totalCost the totalCost to set
	 */
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	/**
	 * @return the reservationId
	 */
	public int getReservationId() {
		return reservationId;
	}

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
	  
	  
	  
	  
	  
	//cancels all reservations by this person
	  /**
	   *Cancelling Reseravations.
	   */
		/*
		 * public void cancelReservations(String guest) { for (int i = 0; i <
		 * rooms.size(); i++) { if (rooms.get(i) != null) { if
		 * (rooms.get(i).getName().equals(guest)) { rooms.set(i,null); } } } }
		 */
	  
	  public void viewReservations() {
		    for (int i = 0; i < rooms.size(); i++) {
		      if (rooms.get(i) != null) {
		        System.out.println(rooms.get(i));  
		      } else {
		        System.out.println((i + 1) + " is not reserved");
		      }
		    }
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
	}
	///////////////////////////////// End Calendar Overrides

	



/*package com.csc330.project;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;


public class Reservations extends Rooms {

	
	
	
	private static final int RoomNo = 0;
	private String startDate;
	private LocalDate duration;
	private String guest;
	private Rooms room;
	private boolean Occupied;
	private Reservations reservation;
	private ArrayList<Reservations> roomReserve;
	
	
	public ArrayList<Reservations> getRoomReserve() {
		return roomReserve;
	}
	public Reservations() {
		this.startDate = toString();
		this.duration = duration;
		this.guest = guest;
	}
	
	public String toString() {
		return "Start date: " + startDate + " duration: " + duration + guest.toString();
	}
		
	public String getStartDate(){ 
		
		return this.startDate; 
		
	}
	
	
	public LocalDate getDuration(){ 
		
		return this.duration;
		
	}
	public String getGuestID() {
		
		return this.guest;
		}
	
	public Rooms getRoomID(){ 
		
		return this.room; 
		
	}
public Reservations getReservationID(){ 
		
		return this.reservation; 
		
	}

	public void setStartDate( String date ){ 
		
		this.startDate = date; 
		
	}
	
	
	public void setDuartion(LocalDate dur){ 
	
		this.duration = dur; 
		
	}
	
	
	
	public boolean setOccupied(boolean occupied) {
		Occupied = occupied;
		return true;
	}



	public boolean isOccupied() {
		return Occupied;
	}
	
	
	
	
	
//this only allocates one room
public int stayRange(LocalDate cust2arrive, int noNights) {
		int room = -1;
		int flag = 0;
		for(int i =0; i < roomReserve.size(); i++) {
			Reservations b = roomReserve.get(i);
			
			LocalDate cust1arrive = b.getArrivalDate();
			LocalDate cust1CheckOut = b.getArrivalDate().plusDays(b.getNoNights()-1);
			LocalDate cust2CheckOut = cust2arrive.plusDays(noNights-1);
			
			if(cust1CheckOut.isBefore(cust2arrive) || cust2CheckOut.isBefore(cust1arrive)) {
				room = RoomNo ; 
			}else {
				flag = 1;
				break;
			}
		}
	
		if(flag == 0) return room;
		return -1;
	}
	
private int getNoNights() {
	// TODO Auto-generated method stub
	return 0;
}
private LocalDate getArrivalDate() {
	
	return null;
}




public boolean addRoom(Guests g, LocalDate date, String noNights) {

		Reservations b = new Reservations();
	    if(g != null && b != null) {
	    	roomReserve.add(b); 
		    Occupied = true;
	    	g.getRoom().add();
	    	
	    	return true;
	    }
	   
		return false;
	}

	
	
	public boolean addReservation() {
		Reservations addRes = new Reservations();
		
		DataAccess da= new DataAccess();
		da.insertReservation(null, duration);
		return true;
		
		
	}
	
	public ArrayList<Reservations> getRoomBookings() {
		return roomReserve;
	}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*	
	private int RoomNo;
	private int capacity;
	private boolean Occupied;
	
	//this only allocates one room
public int stayRange(LocalDate cust2arrive, int noNights) {
		int room = -1;
		int flag = 0;
		for(int i =0; i < roomReserve.size(); i++) {
			Reservations b = roomReserve.get(i);
			//2 possible situations:
			//1. the new cust "2" arrives before existing cust "1": needs to check if cust2 will checkout before cust1 arrives = VALID
			//2. the new cust "2" arrives later than existing cust "1": needs to check if cust1 will checkout before cust2 arrives = VALID
			LocalDate cust1arrive = b.getArrivalDate();
			LocalDate cust1CheckOut = b.getArrivalDate().plusDays(b.getNoNights()-1);
			LocalDate cust2CheckOut = cust2arrive.plusDays(noNights-1);
			//System.out.println();
			if(cust1CheckOut.isBefore(cust2arrive) || cust2CheckOut.isBefore(cust1arrive)) {
				room = RoomNo ; //booking success append array with roomNo
			}else {
				flag = 1;
				break;
			}
		}
	
		if(flag == 0) return room;
		return -1;
	}
	
public boolean bookRoom(Guests c, LocalDate date, int noNights) {

		Reservations b = new Reservations(c.getName() ,date, noNights);
	    if(c != null && b != null) {
	    	roomReserve.add(b); //add new booking that this room has
		    Occupied = true;
	    	c.getRooms().add(this); //update customer who requested the booking 
	    	
	    	return true;
	    }
	   
		return false;
	}
	

public Rooms setOccupied(boolean occupied) {
	Occupied = occupied;
}



public boolean isOccupied() {
	return Occupied;
}
}
	
	*/