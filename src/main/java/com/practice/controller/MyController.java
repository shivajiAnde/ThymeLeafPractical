package com.practice.controller;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {
	
	
	@RequestMapping(value="/about",method = RequestMethod.GET)
	public String about(Model model) {
		System.out.println("inside about handler");
		
		model.addAttribute("name","shivaji royal");
		model.addAttribute("currentDate",new Date());
		return "about";
		//about.html
	}
	
	
	@GetMapping("/loop")
	public String iteratation(Model m) {
		List<String> names=List.of("shivaji","sandeep","hari","john","yesayya");
		m.addAttribute("names", names);
		return "iterate";
	}
	
	@GetMapping("/condition")
	public String conditionalHandler(Model m) {
		System.out.println("conditional statements executed");
		m.addAttribute("isActive",false);
		m.addAttribute("gender","F");
		List<Integer> list = List.of(123);
		m.addAttribute("myList", list);
		return "conditional";
	}
	
	@GetMapping("/service")
	public String servicesHandler(Model m) {
		m.addAttribute("title","magadheera");
		m.addAttribute("subtitle","Bhairava");
		return "service";
	}
	
	@GetMapping("/newabout")
	public String newAbout() {
		return "newabout";
	}
	
	@GetMapping("/contact")
	public String contact() {
		return "contact";
	}
}
