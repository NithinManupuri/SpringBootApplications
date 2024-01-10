package in.spring.service;

import java.util.Collection;


import in.spring.binidng.PassengerInfo;
import in.spring.binidng.Ticket;

public interface ServiceClass {
	
   public Ticket bookTicket(PassengerInfo p);
   public Collection<Ticket> getAllTickets();
   
}
