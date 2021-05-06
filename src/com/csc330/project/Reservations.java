
package com.csc330.project;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

public class Reservations extends Calendar {

	private ArrayList<Reservations> rooms;
	private Bookings bookings;

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

	public Reservations() {
	}

	
	
	public boolean addReservation(String date, String roomType, int numOfDays) {
		
		
		Reservations addRes = new Reservations();
		addRes.setStartDate();
		addRes.guestId();
		addRes.roomId();
		addRes.daysStay();
		addRes.startDate();
		addRes.dateCreated();
		addRes.paidStatus();
		addRes.reservationStatus();
		addRes.confirmStatus();
		addRes.setTotalCost(numOfDays);

		if (DataAccess.checkBooking(date, roomType, numOfDays)) // the make reservation
			return true;
		else
			return false;
		
		
		
		
		String insertString = "INSERT INTO Reservation (GuestID, RoomID, DaysStay,"
		+ "StartDate, DateCreated, PaidStatus, ReservationStatus, "
		+ "ConfirmStatus, TotalCost) VALUES("
		+ + ,,,,,,,,)
		

	}

	// reserves a particular room for this person
	// returns false on failure (eg. room is already reserved)
	/**
	 * Reserve room with person and room number.
	 */
	public boolean makeReservation(String person, int roomNum) {
		try {
			if (rooms.get(roomNum - 1) == null) {
				reserveObj = new Reservations();
				rooms.set(roomNum - 1, reserveObj);
				roomNum++;
				return true;
			}
		} catch (Exception vb) {
			return false;
		}
		return false;
	}

	// cancels all reservations by this person
	/**
	 * Cancelling Reseravations.
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
}
