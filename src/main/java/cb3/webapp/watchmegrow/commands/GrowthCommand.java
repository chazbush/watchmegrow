package cb3.webapp.watchmegrow.commands;

import java.util.Date;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class GrowthCommand {

	private long Id;
	private Date date;
	private float weight;
	private float headSize;
	private float length;
	private String note;
	
	
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
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
