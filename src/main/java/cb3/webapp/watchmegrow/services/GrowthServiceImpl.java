package cb3.webapp.watchmegrow.services;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import cb3.webapp.watchmegrow.models.Growth;
import org.springframework.stereotype.Service;

import cb3.webapp.watchmegrow.commands.GrowthCommand;
import cb3.webapp.watchmegrow.converters.GrowthCommandToGrowth;
import cb3.webapp.watchmegrow.converters.GrowthToGrowthCommand;
import cb3.webapp.watchmegrow.repositories.GrowthRepository;


@Service
public class GrowthServiceImpl implements GrowthService {
	
	private final GrowthRepository growthRepository;
	private final GrowthCommandToGrowth growthCommandToGrowth;
	private final GrowthToGrowthCommand growthToGrowthCommand;
	
	public GrowthServiceImpl(GrowthRepository growthRepository, GrowthCommandToGrowth growthCommandToGrowth, GrowthToGrowthCommand growthToGrowthCommand) {
		this.growthRepository = growthRepository;
		this.growthCommandToGrowth = growthCommandToGrowth;
		this.growthToGrowthCommand = growthToGrowthCommand;
		
	}
	
	@Override
	public Set<Growth> getGrowth() {
		Set<Growth> growthSet = new HashSet<>();
		growthRepository.findAll().iterator().forEachRemaining(growthSet::add);
		return growthSet;
		
	}
	
	@Override
	public long getGrowthCount() {
		long count = growthRepository.count();
		return count;
	}
	
	
	public Growth findById(Long l) {
		
		Optional<Growth> growthRecordOptional = growthRepository.findById(l);
		
		return growthRecordOptional.get();
		
	}
	
	public GrowthCommand saveGrowthRecordCommand(GrowthCommand command) {
		Growth detachedGrowth = growthCommandToGrowth.convert(command);

		Growth savedGrowth = growthRepository.save(detachedGrowth);
		return growthToGrowthCommand.convert(savedGrowth);
	}

}
