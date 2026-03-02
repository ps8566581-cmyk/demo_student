package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "demo_Student")



public class Student {
@Id
	private Integer roll;
	private String name;
	private String division;
	private float mark;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(Integer roll, String name, String division, float mark) {
		super();
		this.roll = roll;
		this.name = name;
		this.division = division;
		this.mark = mark;
	}
	public Integer getRoll() {
		return roll;
	}
	public void setRoll(Integer roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public float getMark() {
		return mark;
	}
	public void setMark(float mark) {
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", division=" + division + ", mark=" + mark + "]";
	}
	
	
	
}
