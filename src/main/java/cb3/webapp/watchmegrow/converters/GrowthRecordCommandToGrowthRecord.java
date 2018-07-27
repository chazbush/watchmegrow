package cb3.webapp.watchmegrow.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import cb3.webapp.watchmegrow.commands.GrowthRecordCommand;
import cb3.webapp.watchmegrow.models.GrowthRecord;
import lombok.Synchronized;


@Component
public class GrowthRecordCommandToGrowthRecord implements Converter<GrowthRecordCommand, GrowthRecord> {
	
		
	@Synchronized
	@Nullable
	@Override
	public GrowthRecord convert (GrowthRecordCommand source) {
		if (source == null) {
			return null;
		}

		final GrowthRecord growthRecord = new GrowthRecord();
		growthRecord.setID(source.getId());
		growthRecord.setDate(source.getDate());
		growthRecord.setWeight(source.getWeight());
		growthRecord.setHeadSize(source.getHeadSize());
		growthRecord.setLength(source.getLength());
		growthRecord.setNote(source.getNote());
		
		return growthRecord;

	
	}
}
