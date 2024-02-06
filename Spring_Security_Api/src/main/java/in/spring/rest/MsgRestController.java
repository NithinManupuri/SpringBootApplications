package in.spring.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
	@GetMapping("/get")
	public String msg() {
		return "Hello World";
		
	}

}
