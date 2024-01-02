package in.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.spring.entity.Customer;
import in.spring.repo.CustomerRepository;

@Service
public class ServiceClass {
         @Autowired
          private CustomerRepository repo;
          
          public void insert() {
        	  repo.insert("nithin", "Apple", 123.0 );
          }
          public void data() {
        	  List<Customer> list=repo.getData();
        	  for(Customer c:list) {
        		  System.out.println(c.toString());
        	  }
          
          }

          public void delete() {
        	  repo.delete("nithin");
          }

}
