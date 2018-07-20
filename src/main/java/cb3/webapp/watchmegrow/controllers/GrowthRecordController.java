package cb3.webapp.watchmegrow.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import cb3.webapp.watchmegrow.commands.GrowthRecordCommand;
import cb3.webapp.watchmegrow.services.GrowthRecService;

@Controller
public class GrowthRecordController {

	private final GrowthRecService growthRecService;
	
	public GrowthRecordController(GrowthRecService growthRecService) {
		this.growthRecService = growthRecService;
	}
	

	@GetMapping ("growth/show/{id}")
	public String UpdateGrowthRecord(@PathVariable String id, Model model) {
		model.addAttribute("growthRecord", growthRecService.findById(new Long(id)));
		return "/growth/AddGrowthRecord";
	}

	@GetMapping ("/add")
	public String GrowthForm(Model model){
		model.addAttribute("growthcommand", new GrowthRecordCommand());
		return "/growth/AddGrowthRecord";
	}

}
