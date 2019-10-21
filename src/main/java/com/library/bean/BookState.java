package com.library.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="book_state")
public class BookState{
	@Id
	private Integer id;
	private String name;
	private Date date;
	private String state;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
}
