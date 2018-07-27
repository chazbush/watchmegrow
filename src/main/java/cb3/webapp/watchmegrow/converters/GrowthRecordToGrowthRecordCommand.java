package cb3.webapp.watchmegrow.converters;


import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import cb3.webapp.watchmegrow.commands.GrowthRecordCommand;
import cb3.webapp.watchmegrow.models.GrowthRecord;

@Component
public class GrowthRecordToGrowthRecordCommand implements Converter<GrowthRecord, GrowthRecordCommand>{

    public GrowthRecordToGrowthRecordCommand(){ 
    }

    final GrowthCommand command 


}