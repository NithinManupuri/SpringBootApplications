package in.spring.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import in.spring.service.CodeReviewExample;

@RestController
public class CodeReviewRest {
	
	
	@Autowired
	private CodeReviewExample service;
	
  public ResponseEntity<String> getMsg(){
	   String msg = service.getMsg();
	  
	  return new ResponseEntity<>(msg,HttpStatus.OK);
  }

}
