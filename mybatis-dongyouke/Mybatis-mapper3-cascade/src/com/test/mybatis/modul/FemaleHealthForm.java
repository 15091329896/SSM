package com.test.mybatis.modul;

public class FemaleHealthForm extends HealthForm{
	private String uterus;

	public String getUterus() {
		return uterus;
	}

	public void setUterus(String uterus) {
		this.uterus = uterus;
	}

	public FemaleHealthForm(long id, long empId, String heart, String liver, String spleen, String lung, String kidney,
			String note, String uterus) {
		super(id, empId, heart, liver, spleen, lung, kidney, note);
		this.uterus = uterus;
	}

	
	
	public FemaleHealthForm(long empId, String heart, String liver, String spleen, String lung, String kidney,
			String note, String uterus) {
		super(empId, heart, liver, spleen, lung, kidney, note);
		this.uterus = uterus;
	}

	public FemaleHealthForm() {
		super();
	}

	@Override
	public String toString() {
		return "FemaleHealthForm [uterus=" + uterus + ", getId()=" + getId() + ", getEmpId()=" + getEmpId()
				+ ", getHeart()=" + getHeart() + ", getLiver()=" + getLiver() + ", getSpleen()=" + getSpleen()
				+ ", getLung()=" + getLung() + ", getKidney()=" + getKidney() + ", getNote()=" + getNote()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

	
	
	
	
}
