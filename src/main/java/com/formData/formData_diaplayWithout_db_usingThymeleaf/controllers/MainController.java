package com.formData.formData_diaplayWithout_db_usingThymeleaf.controllers;

import com.formData.formData_diaplayWithout_db_usingThymeleaf.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

	@GetMapping({"/","/home"})
	public String home() {
		return "home";
	}

	@GetMapping("/services")
	public String services(){
		return "services";
	}


	/*-------contact-------*/
	@GetMapping("/contact")
	public String contact(Model model){
		User user = new User();
		model.addAttribute("user", user);

		return "contact";
	}

	@PostMapping("/contact")
	public String submitForm(@ModelAttribute("user") User user){
//		System.out.println(uesr);

//		return "feedback_success";
		return "contact";
	}

}
