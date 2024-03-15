package in.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.spring.entity.Employee;
import in.spring.service.AppService;

@Controller
public class AppController {
	@Autowired
	private AppService service;
	
	@GetMapping("/items")
	
	public String emp(@RequestParam(defaultValue="0") int page ,Model model){
		int size=3;
		Page<Employee> employee = service.getEmployee(page, size);
		model.addAttribute("emp", employee.getContent());
		model.addAttribute("totalPages", employee.getTotalPages());
		model.addAttribute("curentPage",page);
		return "index";
		
	}
		
	}
