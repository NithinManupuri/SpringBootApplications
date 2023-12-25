package spring_web.BookStore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import spring_web.BookStore.entity.Books;
import spring_web.BookStore.service.ServiceInterface;

@Controller
public class ControllerClass {
	
	@Autowired
	private ServiceInterface service;
	
	@GetMapping("/table")
	public ModelAndView getAllEmp() {
		ModelAndView mav=new ModelAndView();
		List<Books> list=service.getAllBooks();
		mav.addObject("book",list);
		mav.setViewName("table");
		return mav;
		
		
	}
	@GetMapping("/register")
	public ModelAndView getForm() {
		ModelAndView mav=new ModelAndView();
		mav.addObject("books",new Books());
		mav.setViewName("register");
		return mav;
		
	}
	@PostMapping("/save")
	public ModelAndView getRegister(Books b) {
	    ModelAndView mav = new ModelAndView();
	    boolean status = service.Register(b);
	    if (status) {
	        mav.addObject("sucMsg", "sucess");
	    } else {
	    	 mav.addObject("errorMsg", "Failed to save");
	    }
	    mav.setViewName("register");
	    return mav;
	}

    
    @GetMapping("/home")
    public ModelAndView home() {
    	ModelAndView mav=new ModelAndView();
    	mav.addObject("home","homepage" );
    	mav.setViewName("home");
		return mav;
    	
    }
    @GetMapping("/delete")
    public ModelAndView delete(@RequestParam Integer bookId) {
    	ModelAndView mav=new ModelAndView();
    	mav.addObject("delete",service.deleteRec(bookId));
    	mav.setViewName("redirect:/table");
    	
    	return mav;	
    }
    
    @GetMapping("/edit")
    public ModelAndView edit(@RequestParam Integer bookId) {
    	ModelAndView mav=new ModelAndView();
    	  mav.addObject("books",service.editRec(bookId));
    	  mav.setViewName("register");
    	
    	
    	
    	
		return mav;
    	 }
	

}
