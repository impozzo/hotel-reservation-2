package com.csc330.project;

//test
public class Guests {
	
	@Override
	public String toString() {
		return "Guests [guestId=" + guestId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", numbVisits=" + numbVisits + ", telephoneNo=" + telephoneNo + "]";
	}

	private String guestId;
	private String firstName;
	private String lastName;
	private String email;
	private int numbVisits; 
	private int telephoneNo; 

	/**
	 * @return the guestId
	 */
	public Guests addGuest(Guests newGuest) {
		
		DataAccess da = new DataAccess();
		
		Guests addGuest = newGuest;
		
		return da.i nsertGuestData(addGuest); // returns the ID 
	}
	
	public String getGuestId() { 
		return guestId; 
		
		
	}

	/**
	 * @param guestId the guestId to set
	 */
	public void setGuestId(String  guestId) {
		this.guestId = guestId;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	public Guests() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
