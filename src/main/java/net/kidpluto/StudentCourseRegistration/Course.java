package net.kidpluto.StudentCourseRegistration;

import java.util.ArrayList;
import java.util.List;

public class Course {
	
	private Long id;
	private String name;
	private ArrayList<Student> studentsRegistered;
	
	public Course(Long courseId, String courseName) {
		super();
		id = courseId;
		name = courseName;
		studentsRegistered = new ArrayList<Student>();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Student> getStudentsRegistered() {
		return studentsRegistered; 
	}
	public void setStudentRegistered( Student student) {
		studentsRegistered.add( student);
	}
	@Override
	public String toString() {
		return("Course id: " + id + " name: " + name);
	}
}
