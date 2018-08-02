package cb3.webapp.watchmegrow.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import cb3.webapp.watchmegrow.services.GrowthService;

@Controller
public class GrowthController {

	private final GrowthService growthService;
	
	public GrowthController(GrowthService growthService) {
		this.growthService = growthService;
	}
	

	@GetMapping ("growth/show/{id}")
	public String UpdateGrowthRecord(@PathVariable String id, Model model) {
		model.addAttribute("growthRecord", growthService.findById(new Long(id)));
		return "index";
	}
}

	// @PostMapping("/add")
	// public String addUpdateGrowthRecord(@ModelAttribute('dataToUpload') model){
	// 	model.addAttribute("growthcommand", new GrowthCommand());
	// }




