package com.csc330.project;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.sql.SQLException;

/**
 * 
 * @author Michael Weisinger
 *
 */
public class DataAccess {

	private Guests guests;
	private Rooms rooms;
	private Reservations reservations;
	private ReservationView reservationsView;
	private DataAccess dataAccess;
	public static String connectionString;
	private Connection dbConnection = null;

/////////////////////////////////// Utility methods
	public void init() {
		this.setConnectionString("jdbc:sqlite:sqlitedb/HotelRerservation.sqlite");

	}

	/**
	 * @return the connectionString
	 */
	public static String getConnectionString() {
		return connectionString;
	}

	/**
	 * @param connectionString the connectionString to set
	 */
	public static void setConnectionString(String connectionString) {
		DataAccess.connectionString = connectionString;
	}

	public DataAccess() {
		init();
	}

	/**
	 * Connect to a SQLite Database.
	 * 
	 * 
	 * @text connString the connection string for the SQLite Database.
	 * 
	 */
	protected static Connection connect() {

		Connection returnConnection = null;

		try {

			returnConnection = DriverManager.getConnection(DataAccess.connectionString);
			// statement = connection.createStatement();
			// System.out.println("Connection to SQLite has been established.");

		} catch (SQLException e) {

			System.out.println(e.getMessage());
		}

		return returnConnection;
	}

	protected boolean disconnect() {

		try {

			if (this.dbConnection != null) {
				this.dbConnection.close();
			}
		} catch (SQLException ex) {

			System.out.println(ex.getMessage());
			return false;
		}
		return true;
	}
/////////////////////////////////// End utility methods
/////////////////////////////////// Reservations methods
	public static boolean insertReservationData(Reservations r, String roomID) {
		String insertString;
		Reservations insertReservation = r;
		Rooms room;

		/*
		 * "INSERT INTO [Reservation] ([GuestID]" +
		 * ",[RoomID],[DaysStay],[StartDate],[DateCreated] ," +
		 * "[PaidStatus] ,[ReservationStatus],[ConfirmStatus],[TotalCost]) VALUES(" +
		 * insertReservation.get + ", " + <RoomID, int,> + ", " + <DaysStay, int,> +
		 * ", " + <StartDate, text,> + ", " + <DateCreated, text,> + ", " + <PaidStatus,
		 * text,> + ", " + <ReservationStatus, text,> + ", " + <ConfirmStatus, int,> +
		 * ", " + <TotalCost, numeric(18,0),> + ")";
		 */

		return true;
	}

	public static boolean updateReservationData() {
		return true;
	}

	public static boolean deleteReservationData() {
		return true;
	}

	public static Reservations selectReservationData() {
		Reservations r = new Reservations();
		return r;
	}

	public static boolean checkReservationDateData(Date reservationStart, int stayLength) {
		return true;
	}

public static List<Reservations> selectReservationsData() {
		List<Reservations> roomList = new ArrayList();
		String sqlQueryString = "SELECT RoomID, RoomNumber, BasePrice, RoomType FROM Room";

		ResultSet resultSet = null;
		Statement statement = null;

		try {
			this.dbConnection = DriverManager.getConnection(DataAccess.connectionString);

			statement = this.dbConnection.createStatement();
			resultSet = statement.executeQuery(sqlQueryString);

			while (resultSet.next()) {

				// new instance of guest and populate it from the Database
				Rooms resultRoom = new Rooms();
				resultRoom.setRoomID(Integer.parseInt(resultSet.getString("RoomID")));
				resultRoom.setRoomNum(resultSet.getString("RoomNumber"));
				resultRoom.setRoom_type(resultSet.getString("RoomType"));
				resultRoom.setBasePrice(Double.parseDouble(resultSet.getString("BasePrice")));

				// add that to the Set reternGuestsSet
				roomList.add(resultRoom);

				// this.dbConnection.close();
			}

		} catch (SQLException ex) {
			System.err.println(ex.getMessage());
			System.err.println(ex.fillInStackTrace());
		}

		return roomList;
	}

		//Set<Reservations> returnReservationsSet = new HashSet<Reservations>();
		//return returnReservationsSet;
	
/////////////////////////////////// End Reservations methods
/////////////////////////////////// Guests related methods	
	public static int insertGuestData(Guests addGuest) {
		String insertString = "";
		Guests insertGuest = addGuest;
		int returnGuestID = 0;

		insertString = "INSERT INTO [dbo].[Guest]( [FirstName] , [LastName], [Email] + ) VALUES( "
				+ insertGuest.getFirstName() + ", " + insertGuest.getLastName() + ", " + insertGuest.getEmail() + ")";

		return returnGuestID;
	}
	
	public static boolean updateGuestData(int guestID) {
		return true;
	}

	public static boolean deleteGuestData(int guestID) {
		
		return true;
		
	}

	public static List<Guests> selectGuestsData() {
		List<Guests> g = new ArrayList();
		return g;
	}

	//ignore this
	public List<Guests> selectGuests2() {

		ResultSet resultSet = null;
		Statement statement = null;
		List<Guests> reternGuestsSet = new HashSet<Guests>();

		try {
			this.dbConnection = DriverManager.getConnection(DataAccess.connectionString);

			statement = this.dbConnection.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM Guest");

			while (resultSet.next()) {

				// new instance of guest and populate it from the Database
				Guests resultGuest = new Guests();
				resultGuest.setGuestId(resultSet.getString("GuestID"));
				resultGuest.setEmail(resultSet.getString("Email"));
				resultGuest.setFirstName(resultSet.getString("FirstName"));
				resultGuest.setLastName(resultSet.getString("LastName"));

				// add that to the Set reternGuestsSet
				reternGuestsSet.add(resultGuest);

				// this.dbConnection.close();
			}
		}
		// If error happens
		catch (SQLException e) {
			System.out.println(e.getMessage() + "!!!");
			System.exit(0);
		}

		// Return the Set of Guests to main
		return reternGuestsSet;
	}

	public List<Guests> selectGuestsData(int upperlimit) {
		List<Guests> returnGuestsSet = new ArrayList<Guests>();
		DataAccess.connect();
		
		

		return returnGuestsSet;
	}

	public Set<Guests> getGuests(int lowerLimit, int upperLimit) {

		Set<Guests> reternGuestsSet = new HashSet<Guests>();

		return reternGuestsSet;
	}

	/**
	 * Returns a Set of guests matching guestToFind
	 * 
	 * @param guestToFind the lastname, email or ID for guest to find
	 * @return a Guests returnGuest or NULL
	 */
	public static Guests searchGuestsData(String guestToFind)

	{
		Guests returnGuest = new Guests();

		return returnGuest;
	}

	public static boolean insertGuestData() {
		boolean isSuccess = false;
		Statement statement = null;
		String sqlStatement;
		Scanner keyboard = new Scanner(System.in); // to get input
		String firstName;
		String lastName;
		String email;

		Connection conn = connect();

		if (conn == null) // connection failed
		{
			System.out.println("connection to database failed.");
			return isSuccess; // didn connect

		} else {
			System.out.println("Add a guest:");
			System.out.print("Guests first name: ");
			firstName = keyboard.nextLine();
			System.out.print("Guests last name: ");
			lastName = keyboard.nextLine();
			System.out.print("Guests email address: ");
			email = keyboard.nextLine();

			sqlStatement = "INSERT INTO Guest(FirstName, LastName, Email) VALUES ('" + firstName + "', '" + lastName
					+ "', '" + email + "')";

			try {

				statement = conn.createStatement();
				int rows = statement.executeUpdate(sqlStatement);

				isSuccess = true;
				System.out.println(rows + " guest(s) was inserted");
			}

			// If error happens
			catch (SQLException e) {
				System.out.println("guest(s) insert failed");
				System.out.println(e.getMessage());
			}

		}
		return isSuccess;

	}
//////////////////////////////// End Guests related methods
////////////////////////////////Rooms related methods	
	public static Rooms selectRoomData() {
		Rooms r = new Rooms();
		return r;
	}

	public static List<Rooms> selectRoomsData() {
		List<Rooms> roomList = new ArrayList();
		String sqlQueryString = "SELECT RoomID, RoomNumber, BasePrice, RoomType FROM Rooms";

		ResultSet resultSet = null;
		Statement statement = null;

		try {
			this.dbConnection = DriverManager.getConnection(DataAccess.connectionString);

			statement = this.dbConnection.createStatement();
			resultSet = statement.executeQuery(sqlQueryString);

			while (resultSet.next()) {

				// new instance of guest and populate it from the Database
				Rooms resultRoom = new Rooms();
				resultRoom.setRoomID(Integer.parseInt(resultSet.getString("RoomID")));
				resultRoom.setRoomNum(resultSet.getString("RoomNumber"));
				resultRoom.setRoom_type(resultSet.getString("RoomType"));
				resultRoom.setBasePrice(Double.parseDouble(resultSet.getString("BasePrice")));

				// add that to the Set reternGuestsSet
				roomList.add(resultRoom);

				// this.dbConnection.close();
			}

		} catch (SQLException ex) {
			System.err.println(ex.getMessage());
			System.err.println(ex.fillInStackTrace());
		}

		return roomList;
	}
////////////////////////////////End Rooms related methods	

	public static void main(String[] args) {

		setConnectionString("jdbc:sqlite:sqlitedb/HotelRerservation.sqlite");
		DataAccess da = new DataAccess();

		// boolean isSuccess = da.insertGuest();
		// da.getGuests();

		// dtConnectionString("jdbc:sqlite:C:\\data\\sqlite\\trackdb.sqlite");
//		boolean isConnected = da.connect(connectionString);

	}

}
