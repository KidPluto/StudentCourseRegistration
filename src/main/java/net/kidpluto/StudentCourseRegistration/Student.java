package net.kidpluto.StudentCourseRegistration;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
	private Long id;
	private String name;
	private ArrayList<Course> coursesRegistered;
	
	public Student(Long studentId, String studentName) {
		super();
		id = studentId;
		name = studentName;
		coursesRegistered = new ArrayList<Course>();
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
	public List<Course> getCoursesRegistered() {
		return coursesRegistered;
	}
	public void setCourseRegistered( Course course) {
		coursesRegistered.add(course);
	}
	@Override
	public String toString() {
		return("Student id: " + id + " name: " + name);
	}
}
