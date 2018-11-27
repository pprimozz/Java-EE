package com.telusko.hibtest;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table
public class ALien {
	@Id
	private int Id;
	private String name;
	private String lastName;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "ALien [Id=" + Id + ", name=" + name + ", lastName=" + lastName + "]";
	}
	
	

}
