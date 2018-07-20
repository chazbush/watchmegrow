package cb3.webapp.watchmegrow.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cb3.webapp.watchmegrow.commands.GrowthRecordCommand;
import cb3.webapp.watchmegrow.services.GrowthRecService;


@Controller
public class IndexController {
	
	public final GrowthRecService growthRecService;

	
	
	public IndexController (GrowthRecService growthRecService) {
		this.growthRecService = growthRecService;
	}
	
	
	@GetMapping ({"/index"})
	public String getIndexPage(@ModelAttribute("name") final String name, Model model) {
		
	model.addAttribute("growthrecs", growthRecService.getGrowthRecs());
	model.addAttribute("count", growthRecService.getGrowthRecCount());
	model.addAttribute("name", name);
	return "index";
	
	}
	
	@PostMapping ("/add")
	public String addGrowthRecord(@ModelAttribute GrowthRecordCommand growthRecordCommand) {
	return "/growth/AddGrowthRecord";
	
	}
}
