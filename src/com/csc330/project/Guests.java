package com.csc330.project;

 

public class Guests {
	
private String firstName; 
private String lastName; 
private String email; 
private int guestID; 
private int numOfVisits; 
private String telephoneNum; 

private String streetAdd; 
private String zipCode; 
private String city; 
private String state;
private String country;

/**
 * @return the country
 */
public String getCountry() {
	return country;
}


/**
 * @param telephoneNum the telephoneNum to set
 */
public void setTelephoneNum(String telephoneNum) {
	this.telephoneNum = telephoneNum;
}


/**
 * @param country the country to set
 */
public void setCountry(String country) {
	this.country = country;
}


public Guests() {
	// TODO Auto-generated constructor stub
}


public String getName() {
	return firstName + lastName;  
}


public void setFirstName(String firstName) {
	this.firstName = firstName; 
}


public void setLastName(String lastName) {
	this.lastName = lastName; 
}




public String getEmail() {
	return email; 
}


public void setEmail(String email) {
	this.email = email; 
}




public String getCellPhone() {
	return telephoneNum; 
}


public void setPhoneNum(String telephoneNum) {
	this.telephoneNum = telephoneNum; 
}




public void setGuestId(int guestID) {
	this.guestID = guestID; 
}




public int getVisits(int numOfVisits) {
	return numOfVisits; 
}


public void setVisits(int numOfVisits) {
	this.numOfVisits = numOfVisits; 
}




public String getAddress() {
	return streetAdd;  
}


public void setStreetAdd(String streetAdd) {
	this.streetAdd = streetAdd;
}


public void setZipCode(String zipCode) {
	this.zipCode = zipCode;
}

public void setCity(String city) {
	this.city = city;
}


public void setState(String state) {
	this.state = state; 
}




public void search(int guestID) {
	// searches for a guest in the system based on the guestID 
}


public void delete(int guestID) {
	search(guestID);
	// remove the guest from data access and return confirmation that the guest has been removed from the system 
}


public void update(int guestID) {
	search(guestID); 
	//update guest information in the system and return a confirmation message 
}




public static void main(String[] args) {
	// TODO Auto-generated method stub

}


/**
 * @return the guestID
 */
public int getGuestID() {
	return guestID;
}


/**
 * @param guestID the guestID to set
 */
public void setGuestID(int guestID) {
	this.guestID = guestID;
}


/**
 * @return the numOfVisits
 */
public int getNumOfVisits() {
	return numOfVisits;
}


/**
 * @param numOfVisits the numOfVisits to set
 */
public void setNumOfVisits(int numOfVisits) {
	this.numOfVisits = numOfVisits;
}


/**
 * @return the firstName
 */
public String getFirstName() {
	return firstName;
}


/**
 * @return the lastName
 */
public String getLastName() {
	return lastName;
}


/**
 * @return the telephoneNum
 */
public String getTelephoneNum() {
	return telephoneNum;
}


/**
 * @return the streetAdd
 */
public String getStreetAdd() {
	return streetAdd;
}


/**
 * @return the zipCode
 */
public String getZipCode() {
	return zipCode;
}


/**
 * @return the city
 */
public String getCity() {
	return city;
}


/**
 * @return the state
 */
public String getState() {
	return state;
}


@Override
public String toString() {
	return "Guests [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", guestID=" + guestID
			+ ", numOfVisits=" + numOfVisits + ", telephoneNum=" + telephoneNum + ", streetAdd=" + streetAdd
			+ ", zipCode=" + zipCode + ", city=" + city + ", state=" + state + "]";
}


}