package in.spring.service;

import java.util.List;

import in.spring.binding.PassengerInfo;
import in.spring.binding.Ticket;


public interface ServiceInterf {
	
	
	public Ticket bookTicket(PassengerInfo p);
	
	public List<Ticket> getAllTickets();

	
}
