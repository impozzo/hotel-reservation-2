package com.csc330.project;

import java.sql.Date;

public class Bookings {
	
	private int bookingId;
	private int reservationId;
	private int roomId;
	private Date bookingDate;
	private Date calendarDate;
	
	private Reservations reservation;
	

	public Bookings() {
		// TODO Auto-generated constructor stub
	}
	
	public void addBookingDates() {
		
		
	}

	/**
	 * @return the bookingId
	 */
	public int getBookingId() {
		return bookingId;
	}

	/**
	 * @param bookingId the bookingId to set
	 */
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	/**
	 * @return the reservationId
	 */
	public int getReservationId() {
		return reservationId;
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
	 * @return the bookingDate
	 */
	public Date getBookingDate() {
		return bookingDate;
	}

	/**
	 * @param bookingDate the bookingDate to set
	 */
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	/**
	 * @param reservationId the reservationId to set
	 */
	public void setReservationId(int reservationId) {
		this.reservationId = reservationId;
	}

	/**
	 * @return the calendarDate
	 */
	public Date getCalendarDate() {
		return calendarDate;
	}

	/**
	 * @param calendarDate the calendarDate to set
	 */
	public void setCalendarDate(Date calendarDate) {
		this.calendarDate = calendarDate;
	}

}


