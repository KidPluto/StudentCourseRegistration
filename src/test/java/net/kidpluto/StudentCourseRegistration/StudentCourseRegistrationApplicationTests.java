package net.kidpluto.StudentCourseRegistration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentCourseRegistrationApplicationTests {

	@Test
	public void contextLoads() {
	}
	// =================================================
//	Students: 
//		10 Mike
//		11 Carol
//		12 Greg
//		13 Marcia
//		14 Peter 
//		15 Jan
//		16 Bobby
//		17 Cindy
//		18 Alice
//
//  Classes: 
//		100 Relativistic Quantum Field Theory
//		101 Many-body Theory for Condensed Matter Systems
//		102 String Theory and Holographic Duality
//		103 Particle Physics of the Early Universe
		
	@Test
	public void testOne() {
		Student mike = new Student(10L, "Mike");
		
		Course relativistic = new Course(100L, "Relativistic Quantum Field Theory");
		Course manyBody = new Course(101L, "Many-body Theory for Condensed Matter Systems");
		
		mike.setCourseRegistered(relativistic);
		relativistic.setStudentRegistered(mike);
		
		mike.setCourseRegistered(manyBody);
		manyBody.setStudentRegistered(mike);
		
		System.out.println("Mike is registered for: " + mike.getCoursesRegistered().toString());
	}

}
