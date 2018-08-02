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
	private Set<Growth> growthrec;
	
	
	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public String getBio() {
		return Bio;
	}
	public void setBio(String bio) {
		Bio = bio;
	}
	public Set<Growth> getGrowthrec() {
		return growthrec;
	}
	public void setGrowthrec(Set<Growth> growthrec) {
		this.growthrec = growthrec;
	}

	
	

}
