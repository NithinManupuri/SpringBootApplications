package in.spring.db.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.spring.db.entity.Student;

@Controller
public class ClassController {

	@GetMapping("/index1")
	public String userForm(Model model) {
		model.addAttribute("user", new Student());
		return "form2";
	}

}