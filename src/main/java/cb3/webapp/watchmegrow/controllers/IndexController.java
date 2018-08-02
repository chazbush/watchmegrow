package cb3.webapp.watchmegrow.controllers;

import cb3.webapp.watchmegrow.commands.GrowthCommand;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import cb3.webapp.watchmegrow.services.GrowthService;


@Controller
public class IndexController {
	
	public final GrowthService growthService;
	
	public IndexController (GrowthService growthService) {
		this.growthService = growthService;
	}
	
	
	@GetMapping ({"/index"})
	public String getIndexPage(@ModelAttribute("name") final String name, Model model) {
		
	model.addAttribute("growth", growthService.getGrowth());
	model.addAttribute("count", growthService.getGrowthCount());
	model.addAttribute("name", name);
	model.addAttribute("growthCommand", new GrowthCommand());
	return "index";
	
	}
	
}
