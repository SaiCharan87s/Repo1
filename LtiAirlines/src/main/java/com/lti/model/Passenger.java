package com.lti.model;

public class Passenger {
	int passengerId;
	String PassengerName;
	String address;
	public Passenger(int passengerId, String passengerName, String address) {
		super();
		this.passengerId = passengerId;
		PassengerName = passengerName;
		this.address = address;
	}
	public int getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}
	public String getPassengerName() {
		return PassengerName;
	}
	public void setPassengerName(String passengerName) {
		PassengerName = passengerName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
