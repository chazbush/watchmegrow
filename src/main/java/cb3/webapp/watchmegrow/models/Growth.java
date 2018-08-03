package cb3.webapp.watchmegrow.models;


import lombok.Data;
import lombok.Getter;

import java.sql.Time;
import java.util.Date;

import javax.persistence.*;


@Data
@Entity
public class Growth {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	private Date date;
	private Time time;
	private float weight;
	private float headSize;
	private float length;
	private String note;
	@ManyToOne
	private Baby baby;

}
