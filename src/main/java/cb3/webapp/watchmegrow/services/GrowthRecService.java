package cb3.webapp.watchmegrow.services;

import java.util.Set;

import cb3.webapp.watchmegrow.models.GrowthRecord;

public interface GrowthRecService {
	Set<GrowthRecord> getGrowthRecs();
	
	GrowthRecord findById(Long l);
	
	long getGrowthRecCount();
	
}
