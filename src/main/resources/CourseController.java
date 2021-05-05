package com.example.SPRINGBOOTJPA;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demojpa.student.Student;

@RestController
public class CourseController {

	@Autowired
	CourseService courseService;

	@RequestMapping("/students/{id}/courses")
	public List<Course> getAllCourses(@PathVariable int id){   //fetching all resources
		System.out.println("course controller -- getall courses");
		return courseService.getCourses(id);

	}
//	@RequestMapping("/students/{foo}")	
//	public Student getStudent(@PathVariable("foo") int id) {

	@RequestMapping("/students/{studentId}/courses/{courseId}")   
	public Course getCourse(@PathVariable int id) {  //getting a particular resource

		return  courseService.getCourse(id);
	}

	@RequestMapping(method = RequestMethod.POST, value ="students/{studentID}/courses") //create a resource
	public void addCourse(@RequestBody Course course,@PathVariable int studentID) {
		course.setStudent(new Student(studentID,"",0,0));
		courseService.addCourse(course);
	}

	@RequestMapping(method =  RequestMethod.DELETE, value = "students/{id}/courses/{id}")
	public void  deleteCourse(@PathVariable int id) {
		courseService.removeCourse(id);
	}


	@RequestMapping(method = RequestMethod.PUT, value = "students/{studentID}/courses/{courseID}")
	public void updateCourse(@RequestBody Course course, @PathVariable int studentID,@PathVariable int courseID) {
		courseService.updateCourse(course);
	}


}