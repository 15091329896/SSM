package com.test.mybatis.modul;

public abstract class HealthForm {
	private long id;
	private long empId;
	private String heart;
	private String liver;
	private String spleen;
	private String lung;
	private String kidney;
	private String note;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getHeart() {
		return heart;
	}

	public void setHeart(String heart) {
		this.heart = heart;
	}

	public String getLiver() {
		return liver;
	}

	public void setLiver(String liver) {
		this.liver = liver;
	}

	public String getSpleen() {
		return spleen;
	}

	public void setSpleen(String spleen) {
		this.spleen = spleen;
	}

	public String getLung() {
		return lung;
	}

	public void setLung(String lung) {
		this.lung = lung;
	}

	public String getKidney() {
		return kidney;
	}

	public void setKidney(String kidney) {
		this.kidney = kidney;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public HealthForm(long id, long empId, String heart, String liver, String spleen, String lung, String kidney,
			String note) {
		super();
		this.id = id;
		this.empId = empId;
		this.heart = heart;
		this.liver = liver;
		this.spleen = spleen;
		this.lung = lung;
		this.kidney = kidney;
		this.note = note;
	}

	
	
	public HealthForm(long empId, String heart, String liver, String spleen, String lung, String kidney, String note) {
		super();
		this.empId = empId;
		this.heart = heart;
		this.liver = liver;
		this.spleen = spleen;
		this.lung = lung;
		this.kidney = kidney;
		this.note = note;
	}

	public HealthForm() {
		super();
	}

	@Override
	public String toString() {
		return "HealthForm [id=" + id + ", empId=" + empId + ", heart=" + heart + ", liver=" + liver + ", spleen="
				+ spleen + ", lung=" + lung + ", kidney=" + kidney + ", note=" + note + "]";
	}

}
