package in.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.springboot.entity.User;
import jakarta.validation.Valid;

@Controller
public class MailController {
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	@GetMapping("/form")
	public String userForm(Model model) {
		model.addAttribute("user",new User());
		return "form";
		
	}
	@PostMapping("/form")
	public String register(@Valid @ModelAttribute("user") User user,BindingResult result,Model model) {
		if(result.hasErrors()) {
			model.addAttribute("errMsg","Failed to Submit");
			return "form";
		}
		model.addAttribute("succMsg","SucessFul");
		sendMail(user);
		
		return "success";
		
	}
	
	public void sendMail(User user) {
		SimpleMailMessage mailMessage=new SimpleMailMessage();
		mailMessage.setTo(user.getEmail());
		mailMessage.setSubject("Registration sucess");
        mailMessage.setText("Dear " + user.getName() + ",\n\n Thank you registering!\nPhone Number: " + user.getPhno());
         try {
		javaMailSender.send(mailMessage);
         }catch(Exception e) {
        	 e.printStackTrace();
         }
		
		
	}

}
