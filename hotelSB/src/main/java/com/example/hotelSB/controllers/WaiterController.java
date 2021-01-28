package com.example.hotelSB.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.hotelSB.dao.WaitersRepo;
import com.example.hotelSB.model.Waiters;



@RestController
public class WaiterController 
{
	@Autowired
	WaitersRepo wr;
	@RequestMapping("waitersdetails")
	public ModelAndView waiterInput() {
		ModelAndView mv = new ModelAndView("waitersinput");
		return mv;
	}
	@RequestMapping("addWaiter")
	public ModelAndView addWaiter(Waiters waiter1) {
		wr.save(waiter1);
		ModelAndView mv = new ModelAndView();
		mv.addObject("waiterdetails", waiter1);
		mv.setViewName("waiterdetails");
		return mv;
	}
	
	@RequestMapping("getWaiters")
	public List<Waiters> getWaiters(){
		return (List<Waiters>) wr.findAll();
	}
	
	@RequestMapping("getWaiter")
	public Optional<Waiters> getWaiter(int WaiterID) {
		return wr.findById(WaiterID);
	}
	
	@RequestMapping("deleteWaiter")
	public String deleteWaiter(int WaiterID) {
		Waiters waiter1 = wr.getOne(WaiterID);
		wr.delete(waiter1);
		return "Waiter record deleted";
	}

}
