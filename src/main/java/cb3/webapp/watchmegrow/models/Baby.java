package cb3.webapp.watchmegrow.models;

import lombok.Data;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

@Data
@Entity
public class Baby {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ID;
	private String Name;
	private Date DOB;
	
	@Lob
	private String Bio;
	
	@OneToMany (cascade = CascadeType.ALL, mappedBy = "baby")
	private Set<Growth> growth;


	
	

}
