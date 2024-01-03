package in.spring.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRestController{

	@GetMapping("/name")
	public String myName(@RequestParam("name") String name) {
		String msg="My name is "+name;
		return msg;
	}
	
	@GetMapping("/data/{name}")
	public String myJob(@PathVariable() String name) {
		String msg="I am a "+name+" developer!";
		return msg;
		
	}
	
	@GetMapping("/status")
	public ResponseEntity<String> repStatus(){
		String msg="code sucessfully";
		return new ResponseEntity<>(msg,HttpStatus.OK);
		
	}
}
