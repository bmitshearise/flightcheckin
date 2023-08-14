package org.bmit.flightcheckin.dto;

public class ReservationUpdateRequest {

	private Long id;
	private boolean checkIn;
	private Long numOfBags;

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

	@Override
	public String toString() {
		return "ReservationUpdateRequest [id=" + id + ", checkIn=" + checkIn + ", numOfBags=" + numOfBags + "]";
	}


}
