package com.example.hotelSB.model;


import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Cleaners 
{
	@Id
	private int CleanersID;
	private String name;
	private String section;
	private String gender;
	private int age;
	private int workingHours;
	private String sectionAssigned;
	public int getCleanersID() {
		return CleanersID;
	}
	public void setCleanersID(int cleanersID) {
		CleanersID = cleanersID;
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
	public String getSectionAssigned() {
		return sectionAssigned;
	}
	public void setSectionAssigned(String sectionAssigned) {
		this.sectionAssigned = sectionAssigned;
	}
	@Override
	public String toString() {
		return "Cleaners [CleanersID=" + CleanersID + ", name=" + name + ", section=" + section + ", gender=" + gender
				+ ", age=" + age + ", workingHours=" + workingHours + ", sectionAssigned=" + sectionAssigned + "]";
	}


	

}
