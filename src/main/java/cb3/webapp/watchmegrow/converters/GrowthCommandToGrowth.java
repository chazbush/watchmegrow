package cb3.webapp.watchmegrow.converters;

import cb3.webapp.watchmegrow.models.Growth;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import cb3.webapp.watchmegrow.commands.GrowthCommand;
import lombok.Synchronized;


@Component
public class GrowthCommandToGrowth implements Converter<GrowthCommand, Growth> {
	
		
	@Synchronized
	@Nullable
	@Override
	public Growth convert (GrowthCommand source) {
		if (source == null) {
			return null;
		}

		final Growth growth = new Growth();
		growth.setID(source.getId());
		growth.setDate(source.getDate());
		growth.setWeight(source.getWeight());
		growth.setHeadSize(source.getHeadSize());
		growth.setLength(source.getLength());
		growth.setNote(source.getNote());
		
		return growth;

	
	}
}
