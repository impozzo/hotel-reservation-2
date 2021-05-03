package com.csc330.project;

public class CompleteReservations {

	//private CompleteReservations;
	private Reservations reservation; 
	private Guests guest; 
	private Rooms rooms; 
	
	
	public CompleteReservations() {
		//CompleteReservations = new CompleteReservations();
		this.reservation = new Reservations(); 
		this.guest = new Guests(); 
		this.rooms = new Rooms();
	}
	
	public CompleteReservations(Reservations _reservation, Guests _guest, Rooms _room) {
		//CompleteReservations = new CompleteReservations();
		this.reservation = _reservation; 
		this.guest = guest; 
		this.rooms = _room;
	}


	@Override
	public String toString() {
		return "CompleteReservations [reservation=" + reservation + ", guest=" + guest + ", room=" + rooms + "]";
	}


	/**
	 * @return the reservation
	 */
	public Reservations getReservation() {
		return reservation;
	}


	/**
	 * @param reservation the reservation to set
	 */
	public void setReservation(Reservations reservation) {
		this.reservation = reservation;
	}


	/**
	 * @return the guest
	 */
	public Guests getGuest() {
		return guest;
	}


	/**
	 * @param guest the guest to set
	 */
	public void setGuest(Guests guest) {
		this.guest = guest;
	}


	/**
	 * @return the room
	 */
	public Rooms getRoom() {
		return rooms;
	}


	/**
	 * @param rooms the room to set
	 */
	public void setRoom(Rooms rooms) {
		this.rooms = rooms;
	}
	
	

}
