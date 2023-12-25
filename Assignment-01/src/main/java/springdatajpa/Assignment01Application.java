package springdatajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import springdatajpa.dao.DonorRepository;
import springdatajpa.entitiy.Donors;

@SpringBootApplication
public class Assignment01Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Assignment01Application.class, args);
		Donors d=new Donors();
		d.setGroup("o+");
		d.setName("manupuri");
		d.setNumber(939006841);
		DonorRepository repo=context.getBean(DonorRepository.class);
		repo.save(d);
		
	}

}
