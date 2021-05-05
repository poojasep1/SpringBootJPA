package com.example.SPRINGBOOTJPA;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	//CRUD
	@Autowired
	CourseRepository courseRepository;

	List<Course> students = new ArrayList<>();




	public List<Course> getCourses(int id){
		List<Course> students = new ArrayList<>();
		courseRepository.findByStudentId(id).forEach(students::add);
		return students;
	}

	public Course getCourse(int id) {
		//courseRepository.findByStudentID(id);
		return courseRepository.findById(id).get();

	}

	public void addCourse(Course student) {
		courseRepository.save(student);
		/*
		 * System.out.println("controllers add student"); students.add(student);
		 */
	}

	public void updateCourse(Course student) {
		courseRepository.save(student);
	}

	public void removeCourse(int id) {
		courseRepository.deleteById(id);
		//students.removeIf(s -> s.getId() == id);
	}

}