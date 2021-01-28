package com.example.hotelSB.model;


import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Chef 
{
	@Id
	private int ChefID;
	private String name;
	private String section;
	private String gender;
	private int age;
	private int workingHours;
	private int yearsOfExperience;
	
	public int getChefID() {
		return ChefID;
	}
	public void setChefID(int chefID) {
		ChefID = chefID;
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
	public int getYearsOfExperience() {
		return yearsOfExperience;
	}
	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	@Override
	public String toString() {
		return "Chef [ChefID=" + ChefID + ", name=" + name + ", section=" + section + ", gender=" + gender + ", age="
				+ age + ", workingHours=" + workingHours + ", yearsOfExperience=" + yearsOfExperience + "]";
	}


	

}
