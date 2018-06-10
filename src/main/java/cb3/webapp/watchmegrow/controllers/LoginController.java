package cb3.webapp.watchmegrow.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@PostMapping("/login")
	public String login (@RequestParam(name="name") String name, Model model) {
    	if (name == "kensley") {
    		return "index";
    	}
    	 		
    	else {
    		model.addAttribute("error", "Invalid Name");
    		return "login";
    		
    	}	
	}
}

