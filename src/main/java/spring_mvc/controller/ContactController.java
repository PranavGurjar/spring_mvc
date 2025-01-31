package spring_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import spring_mvc.model.User;

import javax.servlet.http.HttpServletRequest;


@Controller
public class ContactController {
	
	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header", "LearnCodeWithMe");
		m.addAttribute("Desc", "Home For Programmer");
		System.out.println("Adding Common Data For Model.");
	}
	
	@RequestMapping("/contact")
	public String contact(Model m) {
		System.out.println("Creating Form");
		
//		m.addAttribute("Header", "LearnCodeWithMe");
//		m.addAttribute("Desc", "Home For Programmer");
		
		return "contact";
	}
	
//	@RequestMapping(path="/processform", method = RequestMethod.POST)
//	public String handlerform(
//			@RequestParam(name="email", required=false) String email, 
//			@RequestParam("uname") String uname, 
//			@RequestParam("upassword") String upassword, 
//			Model model) 
//	{
//		
////		System.out.println("User Email : "+email);
////		System.out.println("User Name : "+uname);
////		System.out.println("User Password : "+upassword);
//		User user = new User();
//		user.setEmail(email);
//		user.setUname(uname);
//		user.setUpassword(upassword);
//		
//		System.out.println(user);
//		
//		
////		model.addAttribute("email", email);
////		model.addAttribute("uname", uname);
////		model.addAttribute("upassword", upassword);
//		model.addAttribute("user", user);
//		
//		return "success";
//	}
	
	
	@RequestMapping(path="/processform", method = RequestMethod.POST)
	public String handlerform(@ModelAttribute User user, Model model) {
//		model.addAttribute("Header", "LearnCodeWithMe");
//		model.addAttribute("Desc", "Home For Programmer");
		System.out.println("Form Submitted!");
		System.out.println(user);	
		return "success";
	}
	
	
	
//	before @requestparam previous method
//	@RequestMapping(path="/processform", method = RequestMethod.POST)
//	public String processform(HttpServletRequest request) {
//		String email = request.getParameter("email");
//		System.out.println("User Email : "+email);
//		
//		String uname = request.getParameter("uname");
//		System.out.println("User Name : "+uname);
//		
//		String upassword = request.getParameter("upassword");
//		System.out.println("User Password : "+upassword);
//		
//		return "success";
//	}
	
}
