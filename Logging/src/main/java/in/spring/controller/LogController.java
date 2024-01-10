package in.spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {
	private static Logger logger=LoggerFactory.getLogger(LogController.class);
	
	
	@GetMapping("/home")
	public String getMsg() {
		logger.info("getMsg() is started");
		String msg="Logger is implemented";
		
		try {
			int i=100/0;
		}catch(Exception e) {
			logger.error("Exception: "+e.getMessage());
		}
		return msg;
	}
}
