package cb3.webapp.watchmegrow.commands;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GrowthCommand {

	private long Id;
	private Date date;
	private float weight;
	private float headSize;
	private float length;
	private String note;

}