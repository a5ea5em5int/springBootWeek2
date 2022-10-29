package com.software.week2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
	
	@GetMapping("/viewPage")
	public String viewPage(Model model)
	{	model.addAttribute("title", "Thymeleaf Exercise");
		model.addAttribute("message", "Hi everyone ! Passionate in Learning SPring boot app");
		return "home";
		
	}
	

}
