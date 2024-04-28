package in.spring.service;

import org.springframework.stereotype.Service;

@Service
public class CodeReviewExample {
	
	
	
	
	public String getMsg() {
	String s = "";
	
	for(int i=0;i<10;i++) {
		s= s+i;
	}
	return s;
	}

}
