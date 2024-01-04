package in.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.spring.binding.Customer;


public interface CustomerService {
	
	public String upsert(Customer c);
	
	public List<Customer> allCustomer();
	
	public Customer getCustomer(Integer id);
	
	public String deleteCustomer(Integer id);
	
	
	
	
	

}
