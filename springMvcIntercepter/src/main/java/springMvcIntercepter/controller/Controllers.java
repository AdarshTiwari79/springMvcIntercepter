package springMvcIntercepter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controllers {

	@RequestMapping("/home")
	public String homeHandler()
	{
		System.out.println("/home request handler have runned.");
		return "home";
	}
	
	@RequestMapping(value="/entered", method=RequestMethod.POST)
	public String formHandler(@RequestParam("input") String name,Model m)
	{
		System.out.println("formHandler controller is activated.");
		m.addAttribute("name",name);
		return "success";
	}
}
