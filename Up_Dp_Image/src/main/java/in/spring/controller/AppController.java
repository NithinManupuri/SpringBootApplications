package in.spring.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import in.spring.entity.Employee;
import in.spring.service.AppService;



@Controller
public class AppController {
	
	@Autowired
	private AppService service;
	
	@GetMapping("/index")
	public String  index(Model model) {
		model.addAttribute("emp",new Employee());
		return "index";
	}
	
	@PostMapping("/")
	public String save(@RequestParam("im") MultipartFile im,Model model,@RequestParam("name") String  name) throws IOException {
		
		boolean b=service.saveEmp(name, im);
		
		if(b) {
			model.addAttribute("msg", "GO");}
		else {
			model.addAttribute("msg", "NotGo");
		}
	
		return "index";
	}
	@GetMapping("/get")
	public String getEmployees(Model model) {
	    List<Employee> allEmp = service.getAllEmp();
	   
	    Map<Integer,String> images = new HashMap<>();

	    for (Employee e : allEmp) {
	        // Convert image byte array to Base64 string
	        String base64Image = Base64.encodeBase64String(e.getImageFile());
	        images.put(e.id,base64Image);
	    }

	    model.addAttribute("emp", allEmp);
	    model.addAttribute("images", images);

	    return "view";
	}
	@GetMapping("/image")
  public String getImage() {
	  return "yup";
  }

}
