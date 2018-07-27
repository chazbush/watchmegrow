package cb3.webapp.watchmegrow.services;

import java.util.HashSet;
import java.util.Set;
import java.util.Optional;

import org.springframework.stereotype.Service;

import cb3.webapp.watchmegrow.commands.GrowthRecordCommand;
import cb3.webapp.watchmegrow.converters.GrowthRecordCommandToGrowthRecord;
import cb3.webapp.watchmegrow.models.GrowthRecord;
import cb3.webapp.watchmegrow.repositories.GrowthRecRepository;
import jdk.internal.jline.internal.Log;

@Service
public class GrowthRecServiceImpl implements GrowthRecService {
	
	private final GrowthRecRepository growthRecRepository;
	private final GrowthRecordCommandToGrowthRecord growthRecordCommandToGrowthRecord;
	
	public GrowthRecServiceImpl (GrowthRecRepository growthRecRepository, GrowthRecordCommandToGrowthRecord growthRecordCommandToGrowthRecord) {
		this.growthRecRepository = growthRecRepository;
		this.growthRecordCommandToGrowthRecord = growthRecordCommandToGrowthRecord;
		
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
	
	
	public GrowthRecord findById(Long l) {
		
		Optional<GrowthRecord> growthRecordOptional = growthRecRepository.findById(l);
		
		return growthRecordOptional.get();
		
	}
	
	public GrowthRecordCommand saveGrowthRecordCommand (GrowthRecordCommand command) {
		GrowthRecord detachedGrowthRecord = growthRecordCommandToGrowthRecord.convert(command);

		GrowthRecord savedGrowthRecord = growthRecRepository.save(detachedGrowthRecord);
		Log.debug("Saved Growth Record ID: " + savedGrowthRecord.getID());
		return growthRecordCommand.convert(savedGrowthRecord);



	}

}
