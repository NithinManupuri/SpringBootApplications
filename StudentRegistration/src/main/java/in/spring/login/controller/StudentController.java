package in.spring.login.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.spring.login.entity.Course;
import in.spring.login.entity.Timings;
import in.spring.login.entity.User;
import in.spring.login.repo.CourseRepository;
import in.spring.login.repo.TimingRepository;
import in.spring.login.repo.UserRepository;
import jakarta.validation.Valid;

@Controller
public class StudentController {
	
	@Autowired
	private CourseRepository crepo;
	@Autowired
	private TimingRepository trepo;
	@Autowired
	private UserRepository urepo;

	@GetMapping("/form")
	public String userForm(Model model) {
		
		List<Course> courses=crepo.findAll();
		List<Timings> timing=trepo.findAll();
		model.addAttribute("user", new User());
		model.addAttribute("tim", timing);
		model.addAttribute("cou", courses);
		
		return "form";
	}
	@PostMapping("/save")
	public String register(@Valid @ModelAttribute("user") User user,Model model,BindingResult result) {
		
		if(result.hasErrors()) {
			model.addAttribute("errMsg", "Falied to register");
			return "form";
		}
		urepo.save(user);
		
		model.addAttribute("succMsg","register succesfull");
		  model.addAttribute("user", new User());
			List<Course> courses=crepo.findAll();
			List<Timings> timing=trepo.findAll();
			model.addAttribute("tim", timing);
			model.addAttribute("cou", courses);
		return "form";
		
	}
}
