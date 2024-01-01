package in.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.spring.entity.User;
import in.spring.repo.UserRepository;

@Service
public class ServiceClass {

	@Autowired
	private UserRepository repo;
	
	public void insert() {
		User u2=new User();
		u2.setName("su");
		u2.setProduct("ape");
	   u2.setAmount(10.0);
		repo.save(u2);
	}
}


