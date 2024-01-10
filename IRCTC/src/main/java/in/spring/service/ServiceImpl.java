package in.spring.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import in.spring.binidng.PassengerInfo;
import in.spring.binidng.Ticket;


@Service
public class ServiceImpl implements ServiceClass{
	
	
       
    HashMap<Integer,Ticket> hashMap=new HashMap<>();
	
    
	public Ticket  bookTicket(PassengerInfo p) {	

		Ticket t=new Ticket();
		Random r=new Random();
		  int val=r.nextInt(5);
		   t.setId(val);
		  BeanUtils.copyProperties(p, t);
		    t.setStatus("Confirmed");
		    hashMap.put(t.getId(), t);
		     return t;
	}

	@Override
	public Collection<Ticket> getAllTickets() {
		Collection<Ticket> tickets=hashMap.values();
		return  tickets;
	}
}
