package org.bmit.flightcheckin.controller;

import org.bmit.flightcheckin.dto.Reservation;
import org.bmit.flightcheckin.dto.ReservationUpdateRequest;
import org.bmit.flightcheckin.integration.ReservationRestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CheckInController {
	
	@Autowired
	ReservationRestClient reservationRestClient;
	
	@RequestMapping("/startcheck")
	public String showStartCheckIn() {
		return "startcheckin";
	}
	
	@RequestMapping("/startcheckin")
	public String startCheckIn(@RequestParam("reservationId") Long reservationId, ModelMap modelMap) {
		Reservation reservation = reservationRestClient.findReservation(reservationId);
		modelMap.addAttribute("reservation", reservation);
		return "displayreservationdetails";
	}
	
	@RequestMapping("/completecheckin")
	public String completeCheckIn(@RequestParam("reservationId") Long reservationId, @RequestParam("numOfBags") Long numOfBags) {
		ReservationUpdateRequest reservationUpdateRequest = new ReservationUpdateRequest();
		reservationUpdateRequest.setId(reservationId);
		reservationUpdateRequest.setCheckIn(true);
		reservationUpdateRequest.setNumOfBags(numOfBags);
		reservationRestClient.updateReservation(reservationUpdateRequest);
		return "checkinconfirmation";
	}
}
