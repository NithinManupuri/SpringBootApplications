package in.spring.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.spring.binding.Customer;
import in.spring.service.CustomerService;

@RestController
public class MyController {
	@Autowired
	private CustomerService service;
   @PutMapping(value="/update",consumes="Application/json",produces="text/plain")
   public ResponseEntity<String> upsert(@RequestBody Customer c){
	     String msg= service.upsert(c);
	   return new ResponseEntity<>(msg,HttpStatus.CREATED);
		
		
    }
	@PostMapping(value="/insert",consumes="application/json",produces="text/plain")
	public  ResponseEntity<String> insert(@RequestBody Customer c) {
		 String msg= service.upsert(c);
		  return new ResponseEntity<>(msg,HttpStatus.OK);
		
	}
	
	@GetMapping(value = "/customers", produces = "application/json")
	public  ResponseEntity<List<Customer>> getAllCustomers() {
		List<Customer> customers=service.allCustomer();
		return new ResponseEntity<>(customers,HttpStatus.OK);
		
	}
	
	@GetMapping("/customer")
	public ResponseEntity<Customer> getCustomer(@RequestParam Integer id){
		Customer c=service.getCustomer(id);
		return new ResponseEntity<>(c,HttpStatus.OK);
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> getById(@PathVariable Integer id){
		String msg=service.deleteCustomer(id);
		 return new ResponseEntity<>(msg,HttpStatus.OK);
		
		
	}

}
