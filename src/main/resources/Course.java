package com.example.SPRINGBOOTJPA;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.example.demojpa.student.Student;

@Entity
public class Course {

	@Id
	int id;
	String name;
	int sem;
	//int avg;

	@ManyToOne
	private Student student;

	public Course() {}
	public Course(int id, String name, int sem, int avg,int studentID) {
		super();
		this.id = id;
		this.name = name;
		this.sem = sem;

		this.student = new Student(studentID,"",0,0);
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
	/*
	 * public int getAvg() { return avg; } public void setAvg(int avg) { this.avg =
	 * avg; }
	 */
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}



}