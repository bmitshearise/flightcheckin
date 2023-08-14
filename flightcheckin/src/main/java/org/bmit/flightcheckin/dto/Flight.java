package org.bmit.flightcheckin.dto;

import java.sql.Timestamp;
import java.util.Date;



import org.springframework.format.annotation.DateTimeFormat;


public class Flight {
	
	private Long id;

	private String fightNum;

	private String operatingAirline;

	private String departureCity;

	private String arrivalCity;

	private Date dateOfDeparture;

	private Timestamp estimatedDepartureTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFightNum() {
		return fightNum;
	}

	public void setFightNum(String fightNum) {
		this.fightNum = fightNum;
	}

	public String getOperatingAirline() {
		return operatingAirline;
	}

	public void setOperatingAirline(String operatingAirline) {
		this.operatingAirline = operatingAirline;
	}

	public String getDepartureCity() {
		return departureCity;
	}

	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}

	public String getArrivalCity() {
		return arrivalCity;
	}

	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}

	public Date getDateOfDeparture() {
		return dateOfDeparture;
	}

	public void setDateOfDeparture(Date dateOfDeparture) {
		this.dateOfDeparture = dateOfDeparture;
	}

	public Timestamp getEstimatedDepartureTime() {
		return estimatedDepartureTime;
	}

	public void setEstimatedDepartureTime(Timestamp estimatedDepartureTime) {
		this.estimatedDepartureTime = estimatedDepartureTime;
	}

	@Override
	public String toString() {
		return "Flight [id=" + id + ", fightNum=" + fightNum + ", operatingAirline=" + operatingAirline
				+ ", departureCity=" + departureCity + ", arrivalCity=" + arrivalCity + ", dateOfDeparture="
				+ dateOfDeparture + ", estimatedDepartureTime=" + estimatedDepartureTime + "]";
	}

}
