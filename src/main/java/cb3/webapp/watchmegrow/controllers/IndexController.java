package cb3.webapp.watchmegrow.controllers;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cb3.webapp.watchmegrow.services.GrowthRecService;


@Controller
public class IndexController {
	
	private final GrowthRecService growthRecService;
	
	public IndexController (GrowthRecService growthRecService) {
		this.growthRecService = growthRecService;
	}
	
	
	@RequestMapping ({"/index"})
	public String getIndexPage(Model model) {
		
	model.addAttribute("growthrecs", growthRecService.getGrowthRecs());
	model.addAttribute("count", growthRecService.getGrowthRecCount());
	System.out.println(growthRecService.getGrowthRecCount());
	growthRecService.getGrowthRecs().forEach(System.out::println);
	System.out.println("here are the " +growthRecService.getGrowthRecs() +"!");
	return "index";
	
	}
	
}
