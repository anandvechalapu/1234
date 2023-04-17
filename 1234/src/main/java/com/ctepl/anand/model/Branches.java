package com.ctepl.anand.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="branches")
public class Branches {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private String name;
	
	@NotNull
	private String number;
	
	@NotNull
	private String wholesaler;
	
	public Branches() {
		
	}
	
	public Branches(String name, String number, String wholesaler) {
		this.name = name;
		this.number = number;
		this.wholesaler = wholesaler;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getWholesaler() {
		return wholesaler;
	}

	public void setWholesaler(String wholesaler) {
		this.wholesaler = wholesaler;
	}
	
	

}