package cb3.webapp.watchmegrow.services;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;
import cb3.webapp.watchmegrow.models.GrowthRecord;
import cb3.webapp.watchmegrow.repositories.GrowthRecRepository;

@Service
public class GrowthRecServiceImpl implements GrowthRecService {
	private final GrowthRecRepository growthRecRepository;
	
	public GrowthRecServiceImpl (GrowthRecRepository growthRecRepository) {
		this.growthRecRepository = growthRecRepository;
		
	}
	
	@Override
	public Set<GrowthRecord> getGrowthRecs() {
		Set<GrowthRecord> growthRecSet = new HashSet<>();
		growthRecRepository.findAll().iterator().forEachRemaining(growthRecSet::add);
		return growthRecSet;
		
	}
	
	@Override
	public long getGrowthRecCount() {
		long count = growthRecRepository.count();
		return count;
	}
}
