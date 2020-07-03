package com.example.shift.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name ="SHIFT_GROUP")
public class ShiftGroup implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
	private int id;
	
	@Column(unique=true, name="CODE")
	private String code;
	
	@ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "shiftGroups")
	private Set<Shift> shift;

	
	public ShiftGroup() {
		
	}
	
	public ShiftGroup(int id, String code) {
		
		this.id = id;
		this.code = code;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	
	/**
	 * @return the shift
	 */
	public Set<Shift> getShift() {
		return shift;
	}

	/**
	 * @param shift the shift to set
	 */
	public void setShift(Set<Shift> shift) {
		this.shift = shift;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	
	
	

}
