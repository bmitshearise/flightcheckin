package org.bmit.flightcheckin.dto;

import java.sql.Timestamp;


public class Reservation {

	private Long id;

	private boolean checkIn;

	private Long numOfBags;

	private Passenger passenger;

	private Flight flight;

	private Timestamp created;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isCheckIn() {
		return checkIn;
	}

	public void setCheckIn(boolean checkIn) {
		this.checkIn = checkIn;
	}

	public Long getNumOfBags() {
		return numOfBags;
	}

	public void setNumOfBags(Long numOfBags) {
		this.numOfBags = numOfBags;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public Timestamp getCreated() {
		return created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}

	@Override
	public String toString() {
		return "Reservation [id=" + id + ", checkIn=" + checkIn + ", numOfBags=" + numOfBags + ", passenger="
				+ passenger + ", flight=" + flight + ", created=" + created + "]";
	}

}
