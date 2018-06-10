package cb3.webapp.watchmegrow.services;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;
import cb3.webapp.watchmegrow.models.GrowthRec;
import cb3.webapp.watchmegrow.repositories.GrowthRecRepository;

@Service
public class GrowthRecServiceImpl {
	private final GrowthRecRepository growthRecRepository;
	
	public GrowthRecServiceImpl (GrowthRecRepository growthRecRepository) {
		this.growthRecRepository = growthRecRepository;
		
	}
	

	public Set<GrowthRec> getGrowthRecs() {
		Set<GrowthRec> growthRecSet = new HashSet<>();
		growthRecRepository.findAll().iterator().forEachRemaining(growthRecSet::add);
		return growthRecSet;
		
	}
}
