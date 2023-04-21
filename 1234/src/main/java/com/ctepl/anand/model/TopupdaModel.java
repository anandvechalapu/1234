package com.ctepl.anand.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TopupdaModel {
	
	@Id
	private Long topupId;
	private String topupName;
	private String topupDescription;
	
	public Long getTopupId() {
		return topupId;
	}
	public void setTopupId(Long topupId) {
		this.topupId = topupId;
	}
	public String getTopupName() {
		return topupName;
	}
	public void setTopupName(String topupName) {
		this.topupName = topupName;
	}
	public String getTopupDescription() {
		return topupDescription;
	}
	public void setTopupDescription(String topupDescription) {
		this.topupDescription = topupDescription;
	}
	
	
}