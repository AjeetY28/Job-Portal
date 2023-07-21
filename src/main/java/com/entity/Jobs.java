package com.entity;

public class Jobs {

	private int id;
	private String titile;
	private String description;
	private String category;
	private String status;
	private String location;
	private String pdate;
	
	public Jobs() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Jobs(String titile, String description, String category, String status, String location, String pdate) {
		super();
		this.titile = titile;
		this.description = description;
		this.category = category;
		this.status = status;
		this.location = location;
		this.pdate = pdate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitile() {
		return titile;
	}

	public void setTitile(String titile) {
		this.titile = titile;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPdate() {
		return pdate;
	}

	public void setPdate(String pdate) {
		this.pdate = pdate;
	}
	
	
}
