package cb3.webapp.watchmegrow.services;

import java.util.Set;

import cb3.webapp.watchmegrow.models.Growth;

public interface GrowthService {
	Set<Growth> getGrowth();
	
	Growth findById(Long l);
	
	long getGrowthCount();
	
}
