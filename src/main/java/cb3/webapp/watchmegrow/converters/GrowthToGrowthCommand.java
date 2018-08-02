package cb3.webapp.watchmegrow.converters;


import cb3.webapp.watchmegrow.commands.GrowthCommand;
import cb3.webapp.watchmegrow.models.Growth;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import lombok.Synchronized;

@Component
public class GrowthToGrowthCommand implements Converter<Growth, GrowthCommand>{

    public GrowthToGrowthCommand(){
    }

    @Synchronized
    @Nullable
    @Override
    public GrowthCommand convert (Growth source) {
        if (source == null) {
            return null;
        }

        final GrowthCommand command = new GrowthCommand();
            command.setId(source.getID());
            command.setWeight(source.getWeight());
            command.setHeadSize(source.getHeadSize());
            command.setLength(source.getLength());
            command.setNote(source.getNote());
            command.setDate(source.getDate());

        return command;
    } 


}