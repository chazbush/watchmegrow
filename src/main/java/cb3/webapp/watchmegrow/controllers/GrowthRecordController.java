package cb3.webapp.watchmegrow.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	@RequestMapping ("growth/show/{id}")
	public String UpdateGrowthRecord(@PathVariable String id, Model model) {
		model.addAttribute("growthRecord", growthRecService.findById(new Long(id)));
		return "/growth/ShowGrowthRecord";
	}
	
	@RequestMapping ("growth/add")
	public String addGrowthRecord(Model model) {
		model.addAttribute("GrowthRecord", new GrowthRecordCommand());
		return "/growth/AddGrowthRecord";
	}
	
}
