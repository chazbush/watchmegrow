package cb3.webapp.watchmegrow.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

import cb3.webapp.watchmegrow.services.LoginService;

@Controller
public class LoginController {
	
	LoginService loginservice = new LoginService();
	
	@GetMapping({"/login", ""})
	public String login () {
		return "login";
	}
	
	@PostMapping("/login")
	public String login (@RequestParam String name, Model model, final RedirectAttributes redirectAttributes) {
    	if (loginservice.validateUser(name)) {
    		redirectAttributes.addFlashAttribute("name", name);
    		return "redirect:index";
    	}
    	 		
    	else {
    		model.addAttribute("error", "is an invalid name.");
    		model.addAttribute("name", name);
    		return "login";
    		
    	}	
	}
}

	