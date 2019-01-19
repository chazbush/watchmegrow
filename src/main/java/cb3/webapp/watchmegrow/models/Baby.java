package cb3.webapp.watchmegrow.models;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Baby {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private Date dob;

	@Lob
	private String bio;
	
	@OneToMany (cascade = CascadeType.ALL, mappedBy = "baby")
	@ToString.Exclude
	private Set<Growth> growth;
	

	@Override
	public String toString() {
	    return "Baby [id=" + id + ", name=" + name + "]";
	}
	

}
