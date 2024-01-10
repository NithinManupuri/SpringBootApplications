package in.spring.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.spring.binding.PassengerInfo;
import in.spring.binding.Ticket;

@Service
public class ServiceImpl implements ServiceInterf {

	@Override
	public Ticket bookTicket(PassengerInfo p) {
		
		String url="http://localhost:8080/p";
		RestTemplate rt=new RestTemplate();
		ResponseEntity<Ticket> t=rt.postForEntity(url,p, Ticket.class);
		
		  Ticket ticket= t.getBody();
		   return ticket;
	}

	@Override
	public List<Ticket> getAllTickets() {
		String url="http://localhost:8080/tickets";
		RestTemplate rt=new RestTemplate();
		ResponseEntity<Ticket[]> re=rt.getForEntity(url,Ticket[].class);
		
		Ticket[] body=re.getBody();
		   List<Ticket> t= Arrays.asList(body);
		return t;
	}

}
