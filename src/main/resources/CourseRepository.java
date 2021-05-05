package com.example.SPRINGBOOTJPA;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Integer> {

			public List<Course> findByStudentId(Integer studentID);
	/*
	 * public List<Course> getCoursesByStudent(Integer studentID); public
	 * List<Course> getCoursesByStudentName(String name);
	 */
}
