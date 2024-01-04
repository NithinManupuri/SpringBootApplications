package in.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.spring.binding.Customer;
import in.spring.repo.CustomerRepo;
@Service
public class ServiceImpl implements CustomerService {
   
	@Autowired
	private CustomerRepo repo;
	@Override
	public String upsert(Customer c) {
	      repo.save(c);
		return "inserted";
	}

	@Override
	public List<Customer> allCustomer() {
		List<Customer> getAll=repo.findAll();
		return getAll;
	}

	@Override
	public Customer getCustomer(Integer id) {
		 Optional<Customer> findById=repo.findById(id);
		 if(findById.isPresent()) {
			return findById.get();
			 
		 }
		return null;
	}

	@Override
	public String deleteCustomer(Integer id) {
		if(repo.existsById(id)) {
			repo.deleteById(id);
			return "deleted";
		}
		
		return "not found";
	}
	
	
	
	

}
