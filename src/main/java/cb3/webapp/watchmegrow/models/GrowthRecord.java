package cb3.webapp.watchmegrow.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class GrowthRecord {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ID;
	private Date date;
	private float weight;
	private float headSize;
	private float length;
	private String note;
	
	@ManyToOne
	private Baby baby;
	
	
	public long getID() {
		return ID;
	}
	public void setID(long Id) {
		ID = Id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public float getHeadSize() {
		return headSize;
	}
	public void setHeadSize(float headSize) {
		this.headSize = headSize;
	}
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	

}
