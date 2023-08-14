package org.bmit.flightcheckin.integration;

import org.bmit.flightcheckin.dto.Reservation;
import org.bmit.flightcheckin.dto.ReservationUpdateRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ReservationRestClientImpl implements ReservationRestClient {

	@Override
	public Reservation findReservation(Long id) {
		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation = restTemplate.getForObject("http://localhost:8080/flightreservation/reservation/"+id, Reservation.class);
		return reservation;
	}

	@Override
	public Reservation updateReservation(ReservationUpdateRequest request) {
		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation = restTemplate.postForObject("http://localhost:8080/flightreservation/reservation/", request, Reservation.class);
		return reservation;
	}

}
