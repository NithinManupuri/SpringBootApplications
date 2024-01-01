package in.spring.service;

import in.spring.repo.PersonRepository;

import java.io.FileInputStream;
import java.io.InputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.Column;
import jakarta.persistence.Lob;
import in.spring.entity.PersonPic;
@Service
public class ServiceClass {
	@Autowired
	private  PersonRepository repo;
	public void insert() {
		try (InputStream is=new FileInputStream("wp2037801.jpg")){
		PersonPic p=new PersonPic();
		p.setName("Taj");
		p.setImage(is.readAllBytes());
		repo.save(p);
		
	}catch(Exception e) {
		e.printStackTrace();
	}
		
	}
	

}
