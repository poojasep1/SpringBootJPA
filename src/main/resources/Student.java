package com.example.SPRINGBOOTJPA;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Student {
	@Id
	int id;
	String name;
	int sem;
	int avg;

	//int avg;

	public Student() {}
	public Student(int id, String name, int sem, int avg) {
		super();
		this.id = id;
		this.name = name;
		this.sem = sem;
		this.avg = avg;
		//this.avg = avg;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSem() {
		return sem;
	}
	public void setSem(int sem) {
		this.sem = sem;
	}
	public int getAvg() {
		return avg;
	}
	public void setAvg(int avg) {
		this.avg = avg;
	}
	/*
	 * public int getAvg() { return avg; } public void setAvg(int avg) { this.avg =
	 * avg; }
	 */