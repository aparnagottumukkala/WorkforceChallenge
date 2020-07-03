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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;


@Entity
@Table(name="SHIFT")
public class Shift implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
	private int id;
	
	@Column(unique=true, name="CODE")
	private String code;
	
	@ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinTable(name = "shift_groupings",
        joinColumns = @JoinColumn(name = "shift_id", referencedColumnName = "code"),
        inverseJoinColumns = @JoinColumn(name = "shiftgroup_id", referencedColumnName = "code"))
	private Set<ShiftGroup> shiftGroups;

	
	public Shift() {
		
	}
	
	public Shift(int id, String code) {
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

	/**
	 * @return the shiftGroups
	 */
	public Set<ShiftGroup> getShiftGroups() {
		return shiftGroups;
	}

	/**
	 * @param shiftGroups the shiftGroups to set
	 */
	public void setShiftGroups(Set<ShiftGroup> shiftGroups) {
		this.shiftGroups = shiftGroups;
	}


	
	
	

}
