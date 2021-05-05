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
	private ReservationsView reservationsView;
	private CompleteReservations completeReservation;
	private DataAccess dataAccess;
	public static final String CONN_STRING = "jdbc:sqlite:sqlitedb/HotelRerservation.sqlite";
	private static Connection dbConnection = null;

/////////////////////////////////// Utility methods
	public void init() {

	}

	/**
	 * @return the connectionString
	 */
	public static String getConnectionString() {
		return CONN_STRING;
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

			returnConnection = DriverManager.getConnection(DataAccess.CONN_STRING);
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
/////////////////////////////////// CompleteReservations methods

/////////////////////////////////// end CompleteReservations methods
/////////////////////////////////// Reservations methods
	public static int insertReservationData(Reservations r, int roomID, int guestId) {
		ResultSet resultSet = null;
		Statement statement = null;
		int returnReservationID = 0;
		String insertString;
		Reservations insertReservation = r;
		Rooms room;

		insertString = "INSERT INTO Reservation (GuestID" + ", RoomID, DaysStay, StartDate,DateCreated, "
				+ "PaidStatus, ReservationStatus, ConfirmStatus, TotalCost) VALUES(" + insertReservation.getGuestId()
				+ ", " + insertReservation.getRoomId() + ", " + insertReservation.getDaysStay() + ", '"
				+ insertReservation.getStartDate() + "', '" + insertReservation.getDateCreated() + "', '"
				+ insertReservation.getPaidStatus() + "', '" + insertReservation.getReservationStatus() + "', '"
				+ insertReservation.getConfirmStatus() + "', " + insertReservation.getTotalCost() + ")";

		try {
			connect();
			statement = dbConnection.createStatement();
			int x = statement.executeUpdate(insertString);
			System.out.print(x);
			return returnReservationID;

		} catch (SQLException e) {
			System.err.println(e.getMessage());
			System.err.println(e.fillInStackTrace());
			return -1;
		}
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

	/*
	 * public static List<Reservations> selectReservationsData() {
	 * List<Reservations> roomList = new ArrayList(); String sqlQueryString =
	 * "SELECT RoomID, RoomNumber, BasePrice, RoomType FROM Room";
	 * 
	 * ResultSet resultSet = null; Statement statement = null;
	 * 
	 * try { dbConnection = DriverManager.getConnection(DataAccess.CONN_STRING);
	 * 
	 * statement = dbConnection.createStatement(); resultSet =
	 * statement.executeQuery(sqlQueryString);
	 * 
	 * while (resultSet.next()) {
	 * 
	 * // new instance of guest and populate it from the Database Rooms resultRoom =
	 * new Rooms();
	 * resultRoom.setRoomID(Integer.parseInt(resultSet.getString("RoomID")));
	 * resultRoom.setRoomNum(resultSet.getString("RoomNumber"));
	 * resultRoom.setRoom_type(resultSet.getString("RoomType"));
	 * resultRoom.setBasePrice(Double.parseDouble(resultSet.getString("BasePrice")))
	 * ;
	 * 
	 * // add that to the Set reternGuestsSet roomList.add(resultRoom);
	 * 
	 * // this.dbConnection.close(); } } catch (SQLException ex) {
	 * System.err.println(ex.getMessage());
	 * System.err.println(ex.fillInStackTrace()); }
	 * 
	 * return roomList; }
	 */
/////////////////////////////////// End Reservations methods
/////////////////////////////////// Guests related methods	
	public static Guests insertGuestData(Guests addGuest) {
		ResultSet resultSet = null;
		Statement statement = null;
		String insertString = "";
		Guests insertGuest = addGuest;
		int returnGuestID = 0;

		dbConnection = connect();

		insertString = "INSERT INTO Guest (FirstName, LastName, Email, TelephoneNum, NumOfVisits, StreetAdd, Zipcode, City, State, Country) VALUES('"
				+ insertGuest.getFirstName() + "', '" + insertGuest.getLastName() + "', '" + insertGuest.getEmail()
				+ "', " + insertGuest.getNumOfVisits() + ", '" + insertGuest.getTelephoneNum() + "', '"
				+ insertGuest.getStreetAdd() + "', '" + insertGuest.getZipCode() + "', '" + insertGuest.getCity()
				+ "', '" + insertGuest.getState() + "', '" + "USA')";

		try {
			statement = dbConnection.createStatement();
			int x = statement.executeUpdate(insertString);
			System.out.print(x);
			return insertGuest;
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			System.err.println(e.fillInStackTrace());
			return null;
		}

	}

	public static boolean updateGuestData(int guestID) {
		return true;
	}

	public static boolean deleteGuestData(int guestID) throws SQLException {

		ResultSet resultSet = null;
		Statement statement = null;
		String deleteString = "";
		int deleteGuestID = guestID;

		try {
			dbConnection = connect();

			deleteString = "DELETE FROM Guest WHERE (GuestID = " + guestID + ")";
			statement = dbConnection.createStatement();
			int x = statement.executeUpdate(deleteString);
			System.out.print(x);
			return true;
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			System.err.println(e.fillInStackTrace());
			return false;
		} finally {
			// dbConnection.close();
		}

	}

	public static Guests selectGuestData(int guestId) throws SQLException {
		Guests returnGuest = new Guests();
		ResultSet resultSet = null;
		Statement statement = null;
		String returnString = "";

		dbConnection = connect();

		returnString = "SELECT * FROM Guest WHERE GuestID = " + guestId;

		try {
			statement = dbConnection.createStatement();
			resultSet = statement.executeQuery(returnString);
			System.out.println();

			while (resultSet.next()) {
				// Retrieve by column name
				returnGuest.setGuestId(resultSet.getInt("GuestID"));
				returnGuest.setFirstName(resultSet.getString("FirstName"));
				returnGuest.setLastName(resultSet.getString("LastName"));
				returnGuest.setEmail(resultSet.getString("Email"));
				returnGuest.setNumOfVisits(resultSet.getInt("NumOfVisits"));
				returnGuest.setPhoneNum(resultSet.getString("TelephoneNum"));
				returnGuest.setState(resultSet.getString("StreetAdd"));
				returnGuest.setZipCode(resultSet.getString("Zipcode"));
				returnGuest.setCity(resultSet.getString("City"));
				returnGuest.setState(resultSet.getString("State"));
				returnGuest.setCountry(resultSet.getString("Country"));

			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			System.err.println(e.fillInStackTrace());
			System.exit(0);
		}
		return returnGuest;

	}

	public static Guests selectGuestData(String emailOrLastName) throws SQLException {
		Guests returnGuest = new Guests();
		ResultSet resultSet = null;
		Statement statement = null;
		String returnString = "";
		int guestId = -1;

		try {
			dbConnection = connect();

			returnString = "SELECT * FROM Guest WHERE GuestID = " + guestId;
			statement = dbConnection.createStatement();
			resultSet = statement.executeQuery(returnString);
			guestId = resultSet.getInt("GuestID");
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			System.err.println(e.fillInStackTrace());
			System.exit(0);
		}
		return selectGuestData(guestId);

	}

	public static List<Guests> selectGuestsData() {
		List<Guests> returnGuestList = new ArrayList();
		ResultSet resultSet = null;
		Statement statement = null;

		connect();

		return returnGuestList;
	}

	/*
	 * public List<Guests> selectGuests2() {
	 * 
	 * ResultSet resultSet = null; Statement statement = null; List<Guests>
	 * reternGuestsSet = new ArrayList<Guests>();
	 * 
	 * try { this.dbConnection =
	 * DriverManager.getConnection(DataAccess.CONN_STRING);
	 * 
	 * statement = this.dbConnection.createStatement(); resultSet =
	 * statement.executeQuery("SELECT * FROM Guest");
	 * 
	 * while (resultSet.next()) {
	 * 
	 * // new instance of guest and populate it from the Database Guests resultGuest
	 * = new Guests(); resultGuest.setGuestId(resultSet.getString("GuestID"));
	 * resultGuest.setEmail(resultSet.getString("Email"));
	 * resultGuest.setFirstName(resultSet.getString("FirstName"));
	 * resultGuest.setLastName(resultSet.getString("LastName"));
	 * 
	 * // add that to the Set reternGuestsSet reternGuestsSet.add(resultGuest);
	 * 
	 * // this.dbConnection.close(); } } // If error happens catch (SQLException e)
	 * { System.out.println(e.getMessage() + "!!!"); System.exit(0); }
	 * 
	 * // Return the Set of Guests to main return reternGuestsSet; }
	 */

	public List<Guests> selectGuestsData(int upperlimit) {
		List<Guests> returnGuestsSet = new ArrayList<Guests>();
		DataAccess.connect();

		return returnGuestsSet;
	}

	/**
	 * Returns a Set of guests matching guestToFind
	 * 
	 * @param guestToFind the lastname, email or ID for guest to find
	 * @return a Guests returnGuest or NULL
	 */
	public static Guests searchGuestsByEmailData(String guestToFind)

	{
		Guests returnGuest = new Guests();

		return returnGuest;
	}

	/*
	 * public static boolean insertGuestData() { boolean isSuccess = false;
	 * Statement statement = null; String sqlStatement; Scanner keyboard = new
	 * Scanner(System.in); // to get input String firstName; String lastName; String
	 * email;
	 * 
	 * Connection conn = connect();
	 * 
	 * if (conn == null) // connection failed {
	 * System.out.println("connection to database failed."); return isSuccess; //
	 * didn connect
	 * 
	 * } else { System.out.println("Add a guest:");
	 * System.out.print("Guests first name: "); firstName = keyboard.nextLine();
	 * System.out.print("Guests last name: "); lastName = keyboard.nextLine();
	 * System.out.print("Guests email address: "); email = keyboard.nextLine();
	 * 
	 * sqlStatement = "INSERT INTO Guest(FirstName, LastName, Email) VALUES ('" +
	 * firstName + "', '" + lastName + "', '" + email + "')";
	 * 
	 * try {
	 * 
	 * statement = conn.createStatement(); int rows =
	 * statement.executeUpdate(sqlStatement);
	 * 
	 * isSuccess = true; System.out.println(rows + " guest(s) was inserted"); }
	 * 
	 * // If error happens catch (SQLException e) {
	 * System.out.println("guest(s) insert failed");
	 * System.out.println(e.getMessage()); }
	 * 
	 * } return isSuccess;
	 * 
	 * }
	 */

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
			dbConnection = DriverManager.getConnection(DataAccess.CONN_STRING);

			statement = dbConnection.createStatement();
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

	public static int getRoomByRoomNumber(String roomNumber) {
		
		int roomId = 0;
		String sqlQueryString = "SELECT RoomID FROM Room WHERE RoomNumber = '"
				+ roomNumber + "'";

		ResultSet resultSet = null;
		Statement statement = null;

		try {
			dbConnection = DriverManager.getConnection(DataAccess.CONN_STRING);

			statement = dbConnection.createStatement();
			resultSet = statement.executeQuery(sqlQueryString);

			roomId = Integer.parseInt(resultSet.getString("RoomID"));

				// this.dbConnection.close();
			}
catch (SQLException ex) {
			System.err.println(ex.getMessage());
			System.err.println(ex.fillInStackTrace());
		}

		return roomId;
	}
	
	public static List<Rooms> selectRoomsByTypeData(String roomType) {
		{
			List<Rooms> roomList = new ArrayList();
			String sqlQueryString = "SELECT RoomID, RoomNumber, BasePrice, RoomType FROM Room" + " WHERE RoomType = '"
					+ roomType + "'";

			ResultSet resultSet = null;
			Statement statement = null;

			try {
				dbConnection = DriverManager.getConnection(DataAccess.CONN_STRING);

				statement = dbConnection.createStatement();
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
	}
////////////////////////////////End Rooms related methods	

	public static void main(String[] args) throws SQLException {

		Scanner keyboardInput = new Scanner(System.in);
		Reservations res = new Reservations();
		Guests guest = new Guests();

		System.out.println(getRoomByRoomNumber("202"));
		
		List<Rooms> rooms1 = new ArrayList();
		rooms1  = selectRoomsByTypeData("Single");
		
		// remove this
		for(Rooms printRoom : rooms1) {
			System.out.println(printRoom.toString());
		}
		
		/*
		 * System.out.println("-------------------------------------------------------")
		 * ;
		 * System.out.println("-----------------Testing Area--------------------------"
		 * );
		 * System.out.println("-------------------------------------------------------")
		 * ; System.out.println("???"); keyboardInput.nextLine();
		 */

		//guest = selectGuestData("Cras@aultricies.net");
		//System.out.println(guest.toString());

		// deleteGuestData("Cras@aultricies.net");
		//System.out.println("OK");
		/*
		 * res.setGuestId(1); res.setDaysStay(5);
		 * 
		 * int row = DataAccess.insertReservationData(res, "101"); int row2 = row;
		 */
		/*
		 * DataAccess da = new DataAccess(); Guests guest = new Guests();
		 * 
		 * guest.setFirstName("Mike"); guest.setLastName("Booth");
		 * guest.setEmail("Mikemike.com");
		 * 
		 * int row = da.insertGuestData(guest); int row2 = row;
		 */

		// boolean isSuccess = da.insertGuest();
		// da.getGuests();

		// dtConnectionString("jdbc:sqlite:C:\\data\\sqlite\\trackdb.sqlite");
//		boolean isConnected = da.connect(connectionString);

	}

}
