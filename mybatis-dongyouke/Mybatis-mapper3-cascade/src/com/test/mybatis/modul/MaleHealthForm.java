package com.test.mybatis.modul;

public class MaleHealthForm extends HealthForm{
	private String prostate;

	public String getProstate() {
		return prostate;
	}

	public void setProstate(String prostate) {
		this.prostate = prostate;
	}

	public MaleHealthForm(long id, long empId, String heart, String liver, String spleen, String lung, String kidney,
			String note, String prostate) {
		super(id, empId, heart, liver, spleen, lung, kidney, note);
		this.prostate = prostate;
	}

	public MaleHealthForm(long empId, String heart, String liver, String spleen, String lung, String kidney,
			String note, String prostate) {
		super(empId, heart, liver, spleen, lung, kidney, note);
		this.prostate = prostate;
	}

	public MaleHealthForm() {
		super();
	}

	@Override
	public String toString() {
		return "MaleHealthFormMapper [prostate=" + prostate + ", getProstate()=" + getProstate() + ", getId()=" + getId()
				+ ", getEmpId()=" + getEmpId() + ", getHeart()=" + getHeart() + ", getLiver()=" + getLiver()
				+ ", getSpleen()=" + getSpleen() + ", getLung()=" + getLung() + ", getKidney()=" + getKidney()
				+ ", getNote()=" + getNote() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	
	
	
}
