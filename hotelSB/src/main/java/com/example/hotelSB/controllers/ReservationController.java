package com.example.hotelSB.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.hotelSB.model.ReserveService;



@Controller
public class ReservationController 
{
	@RequestMapping("reserve")
	public ModelAndView getReservation(@RequestParam("numberOfPeople") int numPeople,@RequestParam("hourReserved") int numHours) {
		ReserveService rs = new ReserveService();
		String computedDetails = rs.reserveSystem(numPeople, numHours);
		ModelAndView mv = new ModelAndView();
		mv.addObject("reservationdetails", computedDetails);
		mv.setViewName("reservationdetails");
		return mv;
	}
}
