package springdatajpa.entitiy;

import org.hibernate.annotations.GenericGenerator;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="Blood_Donor")
public class Donors {
	
	
	@Id
	@GenericGenerator(name="xxx",type = springdatajpa.entitiy.CustomGenerator.class)	  	      
    @GeneratedValue(generator="xxx") 
	private String id;
	@Column(name="Donor_Name")
	private String name;
	@Column(name="Donor_Group")
	private String group;
	@Column(name="Donor_Number")
	private long number;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	

}
