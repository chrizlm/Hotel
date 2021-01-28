package com.example.hotelSB;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.hotelSB.dao.ChefRepo;
import com.example.hotelSB.model.Chef;

@RestController
public class WholeSystController 
{
	
	
	@RequestMapping("home")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("home");
	return mv;
	}
	
	@RequestMapping("staff")
	public ModelAndView employeePortal() {
		ModelAndView mv = new ModelAndView("employeeportal");
		return mv;
	}
	
	@RequestMapping("reservation")
	public ModelAndView reservation() {
		ModelAndView mv = new ModelAndView("reservationpage");
		return mv;
	}


}
