package com.example.hotelSB.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.hotelSB.dao.CleanersRepo;
import com.example.hotelSB.model.Cleaners;



@RestController
public class CleanersController 
{
	@Autowired
	CleanersRepo clr;
	@RequestMapping("cleanersdetails")
	public ModelAndView cleanersInput() {
		ModelAndView mv = new ModelAndView("cleanersinput");
		return mv;
	}
	
	@RequestMapping("addCleaner")
	public ModelAndView addCleaner(Cleaners cleaner1) {
		clr.save(cleaner1);
		ModelAndView mv = new ModelAndView();
		mv.addObject("cleanersdetails", cleaner1);
		mv.setViewName("cleanerdisplay");
		return mv;
	}
	
	@RequestMapping("getCleaners")
	public List<Cleaners> getCleaners(){
		return (List<Cleaners>) clr.findAll();	
	}
	
	@RequestMapping("getCleaner")
	public Optional<Cleaners> getCleaner(int CleanersID) {
		return clr.findById(CleanersID);	
	}
	
	
	@RequestMapping("deleteCleaner")
	public String deleteCleaner(int CleanersID) {
		Cleaners cleaner1 = clr.getOne(CleanersID);
		clr.delete(cleaner1);
		return "cleaner record deleted";
	}

}
