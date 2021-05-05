package com.example.SPRINGBOOTJPA;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class StudentService {
	//CRUD
	@Autowired
	StudentRepository studentRepository;
	List<Student> students = new ArrayList<>();
	public void createStudents() {
		students.add(new Student(1, "aaa", 1, 11));
		students.add(new Student(2, "bbb", 2, 22));
		students.add(new Student(3, "ccc",3, 33));
		students.add(new Student(4, "ddd", 4, 44));
	}
	public List<Student> getStudents(){
		//createStudents();
		//return students;
		List<Student> students = new ArrayList<>();
		studentRepository.findAll().forEach(students::add);
		return students;
	}

	public Student getStudent(int id) {
		Student student=  students.stream().filter(s -> s.getId() == id ).findFirst().get();
		return student;
		return studentRepository.findById(id).get();

	}

	public void addStudent(Student student) {
@@ -46,17 +46,12 @@ public void addStudent(Student student) {
	}

	public void updateStudent(Student student, int id) {
		for(int i = 0; i< students.size(); i++) {
			Student s = students.get(0);
			if(s.getId() == id) {
				students.set(id, student);
				return;
			}
		}
		studentRepository.save(student);
	}

	public void removeStudent(int id) {
		students.removeIf(s -> s.getId() == id);
		studentRepository.deleteById(id);
		//students.removeIf(s -> s.getId() == id);
	}

}