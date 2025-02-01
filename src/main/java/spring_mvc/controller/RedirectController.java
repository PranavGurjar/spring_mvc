package spring_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {
	
	@RequestMapping("/one")
	public RedirectView one() {
		System.out.println("this is one handler.");
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("two");
//		redirectView.setUrl("https://www.google.com/");
		return redirectView;          //redirectView method
//		return "redirect:/two";      //redirect prefix method
	}
	
	@RequestMapping("/two")
	public String two() {
		System.out.println("this is two handler.");
		return "contact";
	}
	
	
}
