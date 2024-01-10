package in.spring.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.spring.binding.PassengerInfo;
import in.spring.binding.Ticket;
import in.spring.service.ServiceInterf;


@Controller
public class MakeMyTripController {
	
	
	@Autowired
	private ServiceInterf service;
	
	@PostMapping("/ticket")
	public String handleTicket(@ModelAttribute("p") PassengerInfo p, Model model) {
	    Ticket t = service.bookTicket(p);
	    
	    if (t != null) {
	        model.addAttribute("msg", "Successfully inserted your ticket id: " + t.getId());
	    } else {
	        model.addAttribute("msg", "Ticket booking failed. Please try again.");
	    }

	    return "bookpage";
	}

	
	
	@GetMapping("/book-Ticket")
	public String bookTicket(Model model) {
		model.addAttribute("p",new PassengerInfo());
      return "bookpage";
	}
	
	@GetMapping("/view")
	public String getAllTickets(Model model) {
		List<Ticket> allTickets=service.getAllTickets();
		 if(allTickets==null) {
			 System.out.println("yes");
		 }

	   model.addAttribute("tickets", allTickets);
    	return "tickets";
    	   
	}
	

	
	

}
