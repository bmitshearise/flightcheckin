package org.bmit.flightcheckin.integration;

import org.bmit.flightcheckin.dto.Reservation;
import org.bmit.flightcheckin.dto.ReservationUpdateRequest;

public interface ReservationRestClient {
	
	public Reservation findReservation(Long id);
	
	public Reservation updateReservation(ReservationUpdateRequest request);

}
