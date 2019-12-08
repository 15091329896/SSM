package com.test.mybatis.modul;

public class Task {
	private long id;
	private String title;
	private String context;
	private String note;

	
	
	public Task(String title, String context, String note) {
		super();
		this.title = title;
		this.context = context;
		this.note = note;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Task(long id, String title, String context, String note) {
		super();
		this.id = id;
		this.title = title;
		this.context = context;
		this.note = note;
	}

	public Task() {
		super();
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", title=" + title + ", context=" + context + ", note=" + note + "]";
	}
}
