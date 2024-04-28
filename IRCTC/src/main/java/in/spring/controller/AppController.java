package in.spring.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.spring.binidng.PassengerInfo;
import in.spring.binidng.Ticket;
import in.spring.service.ServiceClass;

@RestController
public class AppController {
	
	@Autowired
	private ServiceClass service;
	  
	@PostMapping(value="/p",consumes="Application/json",produces="Application/json")
	public Ticket bookTicket(@RequestBody PassengerInfo p) {
		
		Ticket pi=service.bookTicket(p);
		return pi;
		
	}
	
	@PostMapping("/tickets")
	public Collection<Ticket> allTickets() {
		Collection<Ticket> c=service.getAllTickets();
		return c;
		
	}
}
