package com.csc330.project;

import java.util.List;

public class Rooms {

	private Rooms rooms;
	private DataAccess dataAccess;
	private ReservationView reservationView;
	private List<Rooms> roomsList;
	
	private int RoomID;
	private String RoomNum;
	private double BasePrice;
	private String room_type;
	
///////////////////////////////// Getters Setters
	/**
	 * @return the roomID
	 */
	public int getRoomID() {
		return RoomID;
	}

	/**
	 * @param roomID the roomID to set
	 */
	public void setRoomID(int roomID) {
		RoomID = roomID;
	}

	/**
	 * @return the roomNum
	 */
	public String getRoomNum() {
		return RoomNum;
	}

	/**
	 * @param roomNum the roomNum to set
	 */
	public void setRoomNum(String roomNum) {
		RoomNum = roomNum;
	}

	/**
	 * @return the basePrice
	 */
	public double getBasePrice() {
		return BasePrice;
	}

	/**
	 * @param basePrice the basePrice to set
	 */
	public void setBasePrice(double basePrice) {
		BasePrice = basePrice;
	}

	/**
	 * @return the room_type
	 */
	public String getRoom_type() {
		return room_type;
	}

	/**
	 * @param room_type the room_type to set
	 */
	public void setRoom_type(String room_type) {
		this.room_type = room_type;
	}
///////////////////////////////// End Getters Setters
	

	public Rooms() {
		this.reservationView = new ReservationView();
		this.dataAccess = new DataAccess();
	}
	
	@Override
	public String toString() {
		return "Rooms [RoomID=" + RoomID + ", RoomNum=" + RoomNum + ", BasePrice=" + BasePrice + ", room_type="
				+ room_type + "]";
	}

	public void getRoom(String roomNumber)
	{
		Rooms returnRoom  = new Rooms();
		//roomsList = new List<Rooms>();
		// Do some stuff
		
		//return returnRoom;
	}
	
	public  List<Rooms> showAllRooms(/* List<Rooms> roomList */)
	{
		dataAccess.connect();
		roomsList = dataAccess.selectRooms();
		//reservationView.allRoomsView(roomsList);
		
		//Rooms returnRoom  = new Rooms();
		// Do some stuff
		
		return roomsList;
	}

}
