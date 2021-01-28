package com.example.hotelSB.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.hotelSB.dao.ChefRepo;
import com.example.hotelSB.model.Chef;



@RestController
public class ChefController 
{
	@Autowired
	ChefRepo cr;
	@RequestMapping("chefdetails")
	public ModelAndView ChefInput() {
		ModelAndView mv = new ModelAndView("chefinput");
		return mv;
	}
	
	@RequestMapping("addChef")
	public ModelAndView addCheff(Chef chef) {
		Chef chef1 = cr.save(chef);
		ModelAndView mv = new ModelAndView();
		mv.addObject("cdetails", chef1);
		mv.setViewName("chefdisplay");
		return mv;
	}
	
	@RequestMapping("getChefs")
	public List<Chef> getChefs() {
		return (List<Chef>) cr.findAll();	
	}
	
	@RequestMapping("getChef")
	public Optional<Chef> getChef(int ChefID) {
		return cr.findById(ChefID);	
	}
	
	@RequestMapping("deleteChef")
	public String deleteChef(int ChefID) {
		Chef chef1 = cr.getOne(ChefID);
		cr.delete(chef1);
		return "Chef record deleted";
	}

}
