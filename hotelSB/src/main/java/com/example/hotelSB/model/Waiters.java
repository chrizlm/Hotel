package com.example.hotelSB.model;


import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Waiters 
{

	@Id
	private int WaiterID;
	private String name;
	private String section;
	private String gender;
	private int age;
	private int workingHours;
	private int tableAssigned;
	public int getWaiterID() {
		return WaiterID;
	}
	public void setWaiterID(int waiterID) {
		WaiterID = waiterID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWorkingHours() {
		return workingHours;
	}
	public void setWorkingHours(int workingHours) {
		this.workingHours = workingHours;
	}
	public int getTableAssigned() {
		return tableAssigned;
	}
	public void setTableAssigned(int tableAssigned) {
		this.tableAssigned = tableAssigned;
	}
	@Override
	public String toString() {
		return "Waiters [WaiterID=" + WaiterID + ", name=" + name + ", section=" + section + ", gender=" + gender
				+ ", age=" + age + ", workingHours=" + workingHours + ", tableAssigned=" + tableAssigned + "]";
	}

	

	

}
